package test3;

import java.util.Arrays;

/**
 * 인포보스 문제4
 */
public class test4 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String[] card = {"abacdefg","nopqrstu", "hijklkmm"};
//        String[] word = {"ㅈ","ㅇ", "ㅁ"};
        String[] word = {"gㄹkpqm","gpmz", "mmnaㄹ"};



        String[] answer = solution.solution(card, word);
        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}


class Solution3 {
    public String[] solution(String[] card, String[] word) {
        String[] answer = {};

        String cardStr = "";
        String data = "";

        for (String s : card) {
            String[] split = s.split(",");
            for (String s2 : split) {
                cardStr += s2;
            }
        }

        for (String s : word) {
            String[] split = s.split(""); //word 한 단어의 철자 분리

            for (String s1 : split) {
                if (cardStr.contains(s1)){

                }
            }

        }
        String data2 = data.replaceAll(",$", ""); //마지막 콤마 없애기

        String[] strings = Arrays.stream(data2.split(",")).distinct().toArray(String[]::new);

        for (String string : strings) {
            if (string.equals("")) {
                String[] s = {"-1"};
                strings = s;
            }
        }

        return strings;
    }
}