package foundation.codingTest;

import java.util.Arrays;

public class Test28 {

    public static void main(String[] args) {
        /*
         * 뒤에서 5등위로
         *
         * 문제 설명
         * 정수로 이루어진 리스트 num_list가 주어집니다.
         * num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]를 정렬하면
         * [1, 4, 10, 12, 14, 15, 32, 38, 46, 56]이 되고,
         * 앞에서 부터 6번째 이후의 수들을 고르면 [15, 32, 38, 46, 56]가 됩니다.
         *
         *
         *
         * num_list	                                result
         * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
         *
         *
         */
        class Solution {
            public int[] solution(int[] num_list) {
                Arrays.sort(num_list);
                int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
    }
}
