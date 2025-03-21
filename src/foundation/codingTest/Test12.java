package foundation.codingTest;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {
        /*
         * 홀짝 구분하기
         *
         * 문제 설명
         * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
         * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로
         * 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
         *
         *
         * 입출력 예 #1
         * 예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은
         * "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은
         * "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
         *
         * my_string	    overwrite_string	s	result
         * "He11oWor1d"	    "lloWorl"	        2	"HelloWorld"
         * "Program29b8UYP"	"merS123"	        7	"ProgrammerS123"
         */

        class Solution {
            public String solution(String my_string, String overwrite_string, int s) {
                String answer = "";
                int len01 = overwrite_string.length();
                int len02 = my_string.length();
                String sub01 = my_string.substring(0, s);
                String sub02 = my_string.substring((s+len01), len02);

                answer += sub01 + overwrite_string + sub02;

                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("Program29b8UYP","lloWorl", 2);

    }
}
