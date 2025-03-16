package introduction.codingTest;

import java.util.Arrays;

public class Test55 {

    public static void main(String[] args) {
        /*
         * 약수 구하기
         *
         * 문제 설명
         * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * 24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
         *
         * 입출력 예 #2
         * 29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다.
         *
         * n	result
         * 24	[1, 2, 3, 4, 6, 8, 12, 24]
         * 29	[1, 29]
         *
         */
        class Solution {
            public int[] solution(int n) {
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }

                int[] answer = new int[count];
                int index = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        answer[index] = i;
                        index++;
                    }
                }
                Arrays.sort(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(24);
    }
}