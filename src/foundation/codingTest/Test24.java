package foundation.codingTest;

public class Test24 {

    public static void main(String[] args) {
        /*
         * 원소들의 곱과 합
         *
         * 문제 설명
         * 정수가 담긴 리스트 num_list가 주어질 때,
         * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
         * 크면 0을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.
         *
         * 입출력 예 #2
         *
         * 모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.
         *
         * num_list	            result
         * [3, 4, 5, 2, 1]	    1
         * [5, 7, 8, 3]	        0
         *
         *
         */
        class Solution {
            public int solution(int[] num_list) {
                int answer = 0;
                int sumNum = 0;
                int multiSumNum = 0;
                int multiNum = 1;
                for (int i = 0; i < num_list.length; i++) {
                    sumNum += num_list[i];
                    multiNum *= num_list[i];
                    multiSumNum = sumNum * sumNum;

                }
                if (multiNum < multiSumNum ) {
                    answer = 1;
                }else if (multiNum > multiSumNum) {
                    answer = 0;
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(new int[]{3, 4, 5, 2, 1});
    }
}
