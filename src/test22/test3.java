package test22;


/**
 * 인포보스 문제2
 */
public class test3 {

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] a = {3, 2, 3, 2, 3};
//        int[] a = {7, 4, -2, 4, -2, -9};
//        int[] a = {3, 2, 3, 2, 3};
        int solution1 = solution.solution(a);
        System.out.println("solution1 = " + solution1);

    }
}


class Solution3 {
    public int solution(int[] a) {
        int evenCnt = 0;
        int oddCnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        int[] oddNumber = new int[oddCnt];//짝
        int[] evenNumber = new int[evenCnt];//홀


        int evenA = 0;
        int oddB = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = i; j > i; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        System.out.println("a[" + i + "] = " + a[i]);
                    }
                }
                    evenNumber[evenA] = a[i];
                 evenA++;
            } else {
                oddNumber[oddB] = a[i];
                oddB++;
            }
        }



            return 0;
    }
}
