package yg220904;

public class test1 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("01012345678");
        int solution2 = solution.solution("010-1212-333");
        int solution3 = solution.solution("+82-10-3434-2323");
        int solution4 = solution.solution("+82-010-3434-2323");
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
    }


}

class Solution {
    int solution(String phone_number) {
        int answer = 0;

        if (phone_number.length() == 11) {
            if (phone_number.substring(0, 3).equals("010")) {
                answer = 2;
            }
        }
        if (phone_number.contains("-")) {
            String[] phArr = phone_number.split("-");
            if (phArr[2].length() == 3) {
                answer = -1;
            }
        }
        if (phone_number.contains("+82")) {
            if (phone_number.contains("-010-")) {
                answer = -1;
            } else {
                answer = 3;
            }
        }

        return answer;
    }


}

