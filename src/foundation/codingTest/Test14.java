package foundation.codingTest;

public class Test14 {

    public static void main(String[] args) {
        /*
         * 정수찾기
         *
         * 문제 설명
         * 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
         * num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
         *
         * num_list	            n	    result
         * [1, 2, 3, 4, 5]	    3	    1
         * [15, 98, 23, 2, 15]	20	    0
         */

        class Solution {
            public int solution(int[] num_list, int n) {
                int answer = 0;
                for (int i = 0; i < num_list.length; i++) {
                    if (num_list[i] == n) {
                        answer = 1;
                        break;
                    }else {
                        answer = 0;
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{15, 98, 23, 2, 15},20);

    }
}
