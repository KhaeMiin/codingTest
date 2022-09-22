package yg220904;

import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.solution("2-1X5-4X3+2");
        solution4.solution("2X3-1");
    }

}
class Solution4 {
    int solution(String expression) {
        int answer = 0;
        int x = expression.indexOf("-");
        String str = expression.substring(x+1, expression.length());

        if (str.contains("+")) {
            int i = str.indexOf("+");
            str = str.substring(0, i) + ")" + str.substring(i, str.length());
            expression = expression.substring(0, x + 1) + "(" + str;
        } else {
            expression = expression.substring(0, x + 1) + "(" + str + ")";
        }

        System.out.println("expression = " + expression);


        int total = 0;
        String str1 = "";
        if (expression.contains("(")) {
            int start = expression.indexOf("(");
            int end = expression.indexOf(")");
            str1 = expression.substring(start + 1, end);
            System.out.println("str1 = " + str1);

            if (str1.contains("X") || str1.contains("-") || str1.contains("+")) {
                String strNums = str1.replaceAll("[^0-9]", "");
                String[] number = strNums.split(""); //숫자 추출
                int[] num = new int[number.length];
                for (int i = 0; i < number.length; i++) {
                    int su = Integer.parseInt(number[i]);
                    num[i] = su;
                }

                String s1 = str1.replaceAll("[0-9]", "");
                String[] strArr = s1.split("");//연산 부호 추출


                total = num[0];
                for (int i = 0; i < strArr.length; i++) {
                    String s2 = strArr[i]; //0,1,2,3
                    if (s2.equals("X")) {
                        total = total * num[i + 1];
                        System.out.println("total2 = " + total);
                    } else if (s2.equals("+")) {
                        total = total + num[i + 1];
                    } else if (s2.equals("-")) {
                        total = total - num[i + 1];
                    }
                }
                System.out.println("totalNum = " + total);
            }
            String num = str1.replaceAll("[^0-9]", "");
            int numb = Integer.parseInt(num);
            total += numb;


        }



/*        String strNum = expression.replaceAll("[^0-9]", "");
        String[] number = strNum.split(""); //숫자 추출
        int[] num = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            int su = Integer.parseInt(number[i]);
            num[i] = su;
        }

        String s1 = expression.replaceAll("[0-9]", "");
        String[] strArr = s1.split("");//연산 부호 추출*/

/*



        int total = 0;
        String s2 = strArr[0];
        if (s2.equals("X")) {
            total = num[0] * num[1];
        } else if (s2.equals("+")) {
            total = num[0] + num[1];
        } else if (s2.equals("-")) {
            total = num[0] - num[1];
        }

        for (int i = 1; i < strArr.length; i++) {
            s2 = strArr[i]; //0,1,2,3,4
            if (s2.equals("X")) {
                total = total * num[i + 1];
            } else if (s2.equals("+")) {
                total = total + num[i + 1];
            } else if (s2.equals("-")) {
                total = total - num[i + 1];
            }
        }
*/


/*        if (expression.indexOf("X") != 0) {
            int x = expression.indexOf("X");
            String str1 = String.valueOf(expression.charAt(x - 1));
            String str2 = String.valueOf(expression.charAt(x + 1));
            int x1 = Integer.parseInt(str1);
            int x2 = Integer.parseInt(str2);
            answer += x1 * x2;
            String s = str1 + "X" + str2;
            expression.replaceAll(s, String.valueOf(answer));
        }
        if (expression.indexOf("+") != 0) {
            int plus = expression.indexOf("+");
            String str1 = String.valueOf(expression.charAt(plus + 1)); //+ 1
            String str2 = String.valueOf(expression.charAt(plus - 1)); //1 +
            String str3 = String.valueOf(expression.charAt(plus - 2)); //?1 +
            if (str3.equals("+")) {
            }

        }
        if (expression.indexOf("-") != 0) {
            int x = expression.indexOf("-");
            String str1 = String.valueOf(expression.charAt(x - 1));
            String str2 = String.valueOf(expression.charAt(x + 1));
            int x1 = Integer.parseInt(str1);
            int x2 = Integer.parseInt(str2);
            answer = x1 * x2;
            String s = str1 + "X" + str2;
            expression.replaceAll(s, String.valueOf(answer));
        }

        System.out.println("answer = " + answer);*/




        return answer;
    }
}