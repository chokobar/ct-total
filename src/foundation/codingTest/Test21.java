package foundation.codingTest;

public class Test21 {

    public static void main(String[] args) {
        /*
         * 공배수
         *
         * 문제 설명
         * 정수 number와 n, m이 주어집니다.
         * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
         *
         *
         *
         * 입출력 예 #1
         * 60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.
         *
         * 입출력 예 #2
         * 55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.
         *
         * number	    n	    m	    result
         * 60	        2	    3	    1
         * 55	        10	    5	    0
         *
         *
         */
        class Solution {
            public int solution(int number, int n, int m) {
                int answer = 0;
                if (number % n == 0 && number % m == 0) {
                    answer = 1;
                }else if (number % n == 0 || number % m == 0) {
                    answer = 0;
                }
                System.out.println(answer);
                return answer;
            }
        }


        Solution sol = new Solution();
        sol.solution(60 , 2 , 3);

    }
}
