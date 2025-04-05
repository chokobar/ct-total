package practiceProblem.codingTest;

public class Test03 {

    public static void main(String[] args) {
        /*
         * 짝수와 홀수
         *
         * 문제 설명
         * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
         *
         *  num	    return
         *  3	    "Odd"
         *  4	    "Even"
         *
         *
         *
         */
        class Solution {
            public String solution(int num) {
                String answer = "";
                if (num % 2 == 0) {
                    answer += "Even";
                } else {
                    answer += "Odd";
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(3);
    }
}
