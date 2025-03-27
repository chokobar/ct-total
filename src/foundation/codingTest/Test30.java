package foundation.codingTest;

public class Test30 {

    public static void main(String[] args) {
        /*
         * 문자열을 정수로 변환하기
         *
         * 문제 설명
         * 숫자로만 이루어진 문자열 n_str이 주어질 때,
         * n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * "10"을 정수로 바꾸면 10입니다.
         *
         * 입출력 예 #2
         * "8542"를 정수로 바꾸면 8542입니다.
         *
         * n_str	    result
         * "10"	        10
         * "8542"	8542
         *
         */
        class Solution {
            public int solution(String n_str) {
                int answer = 0;
                answer = Integer.valueOf(n_str);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("10");
    }
}
