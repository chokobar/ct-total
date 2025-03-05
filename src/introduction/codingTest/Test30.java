package introduction.codingTest;

public class Test30 {

    public static void main(String[] args) {
        /*
         * 대소문자와 소문자
         *
         * 문제 설명
         * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
         *
         * 입출력 예 #2
         * 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
         *
         */
        class Solution {
            public String solution(String my_string) {
                String answer = "";
                String regex = "^[A-Z]+$";
                String regex1 = "^[a-z]+$";
                for (int i = 0; i < my_string.length(); i++) {
                    if(String.valueOf(my_string.charAt(i)).matches(regex)){
                        answer += String.valueOf(my_string.charAt(i)).toLowerCase();
                    }else {
                        answer += String.valueOf(my_string.charAt(i)).toUpperCase();
                    }

                }
                return answer;
            }
        }
    }
}