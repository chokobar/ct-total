package introduction.codingTest;

import java.util.Arrays;

public class Test52 {

    public static void main(String[] args) {
        /*
         * 최대값 만들기(2)
         *
         * 문제 설명
         * 정수 배열 numbers가 매개변수로 주어집니다.
         * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * 두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
         *
         * 입출력 예 #2
         * 두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
         *
         * 입출력 예 #3
         * 두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
         *
         * numbers	                    result
         * [1, 2, -3, 4, -5]	        15
         * [0, -31, 24, 10, 1, 9]	    240
         * [10, 20, 30, 5, 5, 20, 5]	600
         *
         */
        class Solution {
            public int solution(int[] numbers) {
                int answer = 0;
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < numbers.length - 1; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        int product = numbers[i] * numbers[j];
                        if (product > max) {
                            max = product;
                            answer = max;
                        }
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(new int[]{1, 2, -3, 4, -5});
    }
}