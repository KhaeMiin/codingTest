package test1;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        Solution s = new Solution();
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] solution = s.solution("2022.05.19", terms, privacies);
        System.out.println("solution = " + Arrays.toString(solution));

    }

}

class Solution {
    int[] solution(String today, String[] terms, String[] privacies) {
        //today: 현재 날짜, terms: 가입날짜 기준 유효, 개인정보 가입 날짜)

        //1. privacies에서 terms의 유효기간 A, B, C 등 알파벳이 포함되어 있는지 확인한다. contains
        //2. 그 후 terms의 숫자를 가져와서 privacies의 월에 더한다.
        //이 때 더해서 12가 넘으면 년도에 1을 추가하도록 한다
        // terms의 알파벳은 substring 이용하여 구한다.(왜냐면 다 인덱스 0번째에 있다)
        // privacies 역시 substring 이용하여 구한다. (왜냐먄 년도xxxx, 월xx, 일xx 동일)
        // 마지막으로 계산된 privacies와 현재 날짜인 today '.'과 알파벳 공백을 빼고 순수 숫자로 변환하여 비교계산하여 현재 날짜 이전인 (유효기간 지난 애들) 찾아낸다.
        int count = 0;
        String num = "";
        int todayNum = Integer.parseInt(today.replace(".", ""));
        for (String privacy : privacies) {
            count++;
            for (String term : terms) {
                if (privacy.contains(term.substring(0, 1))) {
                    //terms의 유효기간과 privacy의 년도와 월을 숫자로 바꾼다.
                    int termsNum = Integer.parseInt(term.substring(2, term.length()));
                    int year = Integer.parseInt(privacy.substring(0, 4));
                    int month = Integer.parseInt(privacy.substring(5, 7));

                    month = month + termsNum;
                    if (month > 12) {
                        year = year + 1;
                        month = month - 12;
                    }


                    String strMonth = String.valueOf(month);
                    if (strMonth.length() == 1) {
                        strMonth = "0" + strMonth;
                    }

                    //유효기간이 계산된 privacy
                    String day = privacy.substring(8, 10);
                    String result = String.valueOf(year) + strMonth + day;

                    //현재 날짜와 비교하기
                    if (todayNum >= Integer.parseInt(result)) {
                        num += toString().valueOf(count) + ",";
                    }
                }
            }
        }

        String[] results = num.split(",");
        int[] answer = new int[results.length];

        for (int i = 0; i < results.length; i++) {
            answer[i] = Integer.parseInt(results[i]);
        }

        return answer;
    }
}
