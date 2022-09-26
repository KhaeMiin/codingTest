package test2;


public class test4 {

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
        String C = "Example";
        String solution1 = solution.solution(S, C);
        System.out.println("solution1 = " + solution1);

    }
}


class Solution4 {
    public String solution(String S, String C) {
        String[] name = S.split(","); //이름 분리
        String result = "";
        String result2 = "";
        int count = 1;
        for (String s : name) {
            String f = String.valueOf(s.charAt(0)); //이름 이니셜
            String m = "";
            if (f.equals(" ")) {
                f = String.valueOf(s.charAt(1)); //이름 이니셜
                String m1 = s.substring(1);
                m = m1.substring(m1.indexOf(" ") + 1); //중간이름
            } else {
                m = s.substring(s.indexOf(" ") + 1); //중간이름
            }
            if (m.indexOf(" ") != 0) { //마지막 이름이 있다면
                String l = m.substring(m.indexOf(" ") + 1); //마지막이름
                m = m.replaceAll(" " + l, "");
            }

            result += s + " <" + f.toLowerCase() + m.toLowerCase() + "@" + C.toLowerCase() + ".com>,";

            String s1 = f.toLowerCase() + m.toLowerCase();

            int length = result.replace(String.valueOf(s1), "").length();
            result2 = result.replaceAll(s1, s1 + length);

        }

        System.out.println("result2 = " + result2);

        return result.replaceAll(",$", "");
    }
}
