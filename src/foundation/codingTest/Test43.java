package foundation.codingTest;

public class Test43 {

    public static void main(String[] args) {
        /*
         * 0 떼기
         *
         * 문제 설명
         * 정수로 이루어진 문자열 n_str이 주어질 때,
         * n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
         *
         * n_str	    result
         * "0010"	    "10"
         * "854020"	    "854020"
         *
         *
         */
        class Solution {
            public String solution(String n_str) {
                String answer = Integer.toString(Integer.parseInt(n_str));
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("0010");
    }
}
