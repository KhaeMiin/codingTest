package test3;


import java.util.Arrays;

/**
 * 인포보스 문제2
 */
public class test3 {

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] waiting = {1, 5, 8, 2, 10, 5, 4, 6, 4, 8};
        int[] solution1 = solution.solution(waiting);
        for (int i : solution1) {
            System.out.println("i = " + i);
        }

    }
}


class Solution2 {
    public int[] solution(int[] waiting) {
        int[] answer = Arrays.stream(waiting).distinct().toArray();


        return answer;
    }
}
