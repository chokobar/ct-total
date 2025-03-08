package introduction.codingTest;

import java.util.Arrays;

public class Test39 {

    public static void main(String[] args) {
        /*
         * 중복된 숫자 개수
         *
         * 문제 설명
         * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * [1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.
         *
         * 입출력 예 #2
         * [0, 2, 3, 4] 에는 1이 0개 있습니다.
         *
         */
        class Solution {
            public int solution(int[] array, int n) {
                int answer = 0;
                int count = 0;
                System.out.println(Arrays.toString(array));
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == n) {
                        count++;
                        answer = count;
                    }
                }

                return answer;
            }
        }

        Solution sol = new Solution();

       sol.solution(new int[]{1, 1, 2, 3, 4, 5},1);
    }
}