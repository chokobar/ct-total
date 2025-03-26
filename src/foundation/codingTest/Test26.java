package foundation.codingTest;

public class Test26 {

    public static void main(String[] args) {
        /*
         * 문자열 정수의 합
         *
         * 문제 설명
         * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
         *
         * 입출력 예 #2
         * 문자열 안의 모든 숫자를 더하면 1이 됩니다.
         *
         * num_str	        result
         * "123456789"	    45
         * "1000000"	    1
         *
         *
         */
        class Solution {
            public int solution(String num_str) {
                int answer = 0;
                for (int i = 0; i < num_str.length(); i++) {
                    answer += Integer.parseInt(num_str.charAt(i) + "");
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("123456789");
    }
}
