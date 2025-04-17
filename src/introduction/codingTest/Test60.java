package introduction.codingTest;

import java.util.Arrays;

public class Test60 {

    public static void main(String[] args) {
        /*
         * A로 B만들기
         *
         * 문제 설명
         * 문자열 before와 after가 매개변수로 주어질 때,
         * before의 순서를 바꾸어 after를 만들 수 있으면 1을,
         * 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * "olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
         *
         * 입출력 예 #2
         * "allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
         *
         * before	    after	    result
         * "olleh"	    "hello"	    1
         * "allpe"	    "apple"	    0
         *
         */
        class Solution {
            public int solution(String before, String after) {
                int answer = 0;

                char[] beforeArr = before.toCharArray();
                char[] afterArr = after.toCharArray();

                Arrays.sort(beforeArr);
                Arrays.sort(afterArr);

                if (Arrays.equals(beforeArr, afterArr)) {
                    answer = 1;
                } else {
                    answer = 0;
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("allpe" , "apple");
    }
}