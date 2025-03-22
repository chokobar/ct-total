package foundation.codingTest;

public class Test16 {

    public static void main(String[] args) {
        /*
         * 문자열 곱하기
         *
         * 문제 설명
         * 문자열 my_string과 정수 k가 주어질 때,
         * my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
         *
         *
         * 입출력 예 #1
         * 예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은
         * "stringstringstring"이므로 이를 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은
         *
         * "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.
         *
         * my_string	    k	    result
         * "string"	        3	    "stringstringstring"
         * "love"	        10	    "lovelovelovelovelovelovelovelovelovelove"
         *
         *
         */

        class Solution {
            public String solution(String my_string, int k) {
                String answer = "";
                for (int i = 0; i < k; i++) {
                    answer += my_string;
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("string", 3);

    }
}
