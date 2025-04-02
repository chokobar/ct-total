package foundation.codingTest;

public class Test47 {

    public static void main(String[] args) {
        /*
         * 문자열 바꿔서 찾기
         *
         * 문제 설명
         * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
         * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중
         * pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
         *
         * myString	    pat	        result
         * "ABBAA"	    "AABB"	    1
         * "ABAB"	    "ABAB"	    0
         *
         *
         * 입출력 예 #1
         * "ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다.
         * 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.
         *
         *
         * 입출력 예 #2
         * "ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다.
         * 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
         *
         */
        class Solution {
            public int solution(String myString, String pat) {
                String answer = "";
                for(int i = 0; i < myString.length(); i++) {
                    if(String.valueOf(myString.charAt(i)).equals("A")) {
                        answer += "B";
                    } else {
                        answer += "A";
                    }
                }
                if (answer.contains(pat)) {
                    return 1;
                }
                return 0;
            }
        }

        Solution sol = new Solution();
        sol.solution("ABAB" , "AABB");
    }
}
