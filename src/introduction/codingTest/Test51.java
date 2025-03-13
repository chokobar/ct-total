package introduction.codingTest;

public class Test51 {

    public static void main(String[] args) {
        /*
         * 문자열안의 문자열
         *
         * 문제 설명
         * 문자열 str1, str2가 매개변수로 주어집니다.
         * str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * "ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.
         *
         * 입출력 예 #2
         * "ppprrrogrammers" str1에 str2가 없으므로 2를 return합니다.
         *
         * 입출력 예 #3
         * "AbcAbcA" str1에 str2가 없으므로 2를 return합니다.
         *
         *
         * str1	                        str2	    result
         * "ab6CDE443fgh22iJKlmn1o"	    "6CD"	    1
         * "ppprrrogrammers"	        "pppp"	    2
         * "AbcAbcA"	                "AAA"	    2
         *
         */
        class Solution {
            public int solution(String str1, String str2) {
                int answer = 0;
                //int count = 0;
                if (str1.contains(str2)) {
                    answer = 1;
                } else {
                    answer = 2;
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("ppprrrogrammers","pppp");
    }
}