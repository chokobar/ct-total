package practiceProblem.codingTest;

public class Test08 {

    public static void main(String[] args) {
        /*
         * 두 정수 사이의 합
         *
         * 문제 설명
         * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
         * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
         *
         *
         *  a	    b	    return
         *  3	    5	    12
         *  3	    3	    3
         *  5	    3	    12
         *
         *
         */
        class Solution {
            public long solution(int a, int b) {
                long answer = 0;
                int max = 0;
                int min = 0;
                if (a > b) {
                    max = a;
                    min = b;
                } else {
                   max = b;
                   min = a;
                }
                for (int i = min; i <= max; i++) {
                    answer += i;
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(3 , 5);
    }
}
