package practiceProblem.codingTest;

import java.util.Arrays;

public class Test06 {

    public static void main(String[] args) {
        /*
         * 간단 식 계산하기
         *
         * 문제 설명
         * 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수,
         * op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
         *
         *  binomial	    result
         * "43 + 12"	    55
         * "0 - 7777"	    -7777
         * "40000 * 40000"	1600000000
         *
         *입출력 예 #1
         * 예제 1번의 binomial은 "43 + 12"로 이 식을 계산한 결과인 43 + 12 = 55를 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번의 binomial은 "0 - 7777"로 이 식을 계산한 결과인 0 - 7777 = -7777을 return 합니다.
         *
         * 입출력 예 #3
         * 예제 3번의 binomial은 "40000 * 40000"으로 이 식을 계산한 결과인 40000 × 40000 = 1600000000을 return 합니다.
         *
         */
        class Solution {
            public int solution(String binomial) {
                int answer = 0;
                String[] parts = binomial.split(" ");

                int a = Integer.parseInt(parts[0]);
                String op = parts[1];
                int b = Integer.parseInt(parts[2]);

                if (op.equals("+")) {
                    answer = a + b;
                } else if (op.equals("-")) {
                    answer = a - b;
                } else if (op.equals("*")) {
                    answer = a * b;
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("43 + 12");
    }
}
