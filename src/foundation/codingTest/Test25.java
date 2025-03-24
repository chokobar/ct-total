package foundation.codingTest;

public class Test25 {

    public static void main(String[] args) {
        /*
         * 이어붙인 수
         *
         * 문제 설명
         * 정수가 담긴 리스트 num_list가 주어집니다.
         * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로
         * 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.
         *
         * 입출력 예 #2
         * 홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.
         *
         * num_list	            result
         * [3, 4, 5, 2, 1]	    393
         * [5, 7, 8, 3]	        581
         *
         *
         */
        class Solution {
            public int solution(int[] num_list) {
                int answer = 0;
                String word01 = "";
                String word02 = "";
                for (int i = 0; i < num_list.length; i++) {
                    if (num_list[i] % 2 == 0) {
                        String worldNum01 = String.valueOf(num_list[i]);
                        word01 += worldNum01;
                    } else {
                        String worldNum02 = String.valueOf(num_list[i]);
                        word02 += worldNum02;
                    }
                }
                answer = Integer.parseInt(word01) + Integer.parseInt(word02);
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(new int[]{3, 4, 5, 2, 1});
    }
}
