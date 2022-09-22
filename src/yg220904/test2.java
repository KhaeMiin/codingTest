package yg220904;

public class test2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] a = {1, 3, 7, 8, 10, 15};
        int[] b = {1, 2, 12, 14, 15};
        int result1 = solution2.solution(a, 3);
        int result2 = solution2.solution(b, 4);
    }

}

class Solution2 {
    int solution(int[] scores, int k) {
        int answer = 0;
        int num = k;
        for (int i = 0; i > scores.length; i++) {
            for (int j = 0; j > k; j++) {

            }
        }
        return answer;
    }
}
