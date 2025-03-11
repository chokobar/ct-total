package introduction.codingTest;

public class Test46 {

    public static void main(String[] args) {
        /*
         * 숨어있는 숫자의 덧셈(1)
         *
         * 문제 설명
         * 문자열 my_string이 매개변수로 주어집니다.
         * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * "aAb1B2cC34oOp"안의 한자리 자연수는 1, 2, 3, 4 입니다.
         * 따라서 1 + 2 + 3 + 4 = 10 을 return합니다.
         *
         * 입출력 예 #2
         * "1a2b3c4d123Z"안의 한자리 자연수는 1, 2, 3, 4, 1, 2, 3 입니다.
         * 따라서 1 + 2 + 3 + 4 + 1 + 2 + 3 = 16 을 return합니다.
         *
         * my_string	        result
         * "aAb1B2cC34oOp"	    10
         * "1a2b3c4d123"	    16
         */
        class Solution {
            public int solution(String my_string) {
                int answer = 0;
                for (int i = 0; i < my_string.length(); i++) {
                    char ch = my_string.charAt(i);
                    if (Character.isDigit(ch)) {
                        answer += ch - '0';
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("aAb1B2cC34oOp");
    }
}