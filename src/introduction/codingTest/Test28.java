package introduction.codingTest;


public class Test28 {

    public static void main(String[] args) {
        /*
         * 문자열 뒤집기
         *
         * 문제 설명
         * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은
         * 문자열을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
         *
         * 입출력 예 #2
         * my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
         *
         */
        class Solution {
            public String solution(String my_string) {
                String answer = "";

                StringBuffer sb = new StringBuffer(my_string);
                answer = sb.reverse().toString();

                return answer;
            }
        }

    }
}
