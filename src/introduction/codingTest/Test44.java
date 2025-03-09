package introduction.codingTest;

import java.util.Arrays;

public class Test44 {

    public static void main(String[] args) {
        /*
         * n의 배수고르기
         *
         * 문제 설명
         * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
         * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
         *
         * 입출력 예 #2
         * numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
         *
         * 입출력 예 #3
         * numlist에서 12의 배수만을 남긴 [120, 600, 12, 12]를 return합니다.
         *
         *  n	    numlist	                        result
         *  3	    [4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
         *  5	    [1, 9, 3, 10, 13, 5]	        [10, 5]
         *  12	    [2, 100, 120, 600, 12, 12]	    [120, 600, 12, 12]
         */
        class Solution {
            public int[] solution(int n, int[] numlist) {
                int arrCount = 0;

                for (int i = 0; i < numlist.length; i++) {
                    if (numlist[i] % n ==0) {
                        arrCount++;
                        System.out.println(arrCount);
                    }
                }

                int[] answer = new int[arrCount];
                int index = 0;

                for (int i = 0; i < numlist.length; i++) {
                    if (numlist[i] % n == 0) {
                        answer[index] = numlist[i];
                        index++;
                    }
                }
                System.out.println(Arrays.toString(answer));
                return answer;
            }
        }

        Solution sol = new Solution();
        //sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        sol.solution(3, new int[]{2, 100, 120, 600, 12, 12});
    }
}