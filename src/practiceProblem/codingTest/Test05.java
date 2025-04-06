package practiceProblem.codingTest;

import java.util.Arrays;

public class Test05 {

    public static void main(String[] args) {
        /*
         * 자연수 뒤집어 배열로 만들기
         *
         * 문제 설명
         * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
         *
         *  n	        return
         *  12345	    [5,4,3,2,1]
         *
         *
         *
         */
        class Solution {
            public int[] solution(long n) {
                String str = Long.toString(n);
                int length = str.length();
                int[] answer = new int[length];

                for (int k = 0; k < length; k++) {
                    answer[k] = str.charAt(length - 1 - k) - '0';
                }

                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(12345L);
    }
}
