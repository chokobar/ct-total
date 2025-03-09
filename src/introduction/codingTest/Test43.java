package introduction.codingTest;

public class Test43 {

    public static void main(String[] args) {
        /*
         * 배열의 유사도
         *
         * 문제 설명
         * 문자열 배열 strlist가 매개변수로 주어집니다.
         * strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * "b"와 "c"가 같으므로 2를 return합니다.
         *
         * 입출력 예 #2
         * 같은 원소가 없으므로 0을 return합니다.
         *
         *
         * s1	            s2	                            result
         * ["a", "b", "c"]	["com", "b", "d", "p", "c"]	    2
         * ["n", "omg"]	    ["m", "dot"]	                0
         *
         */
        class Solution {
            public int solution(String[] s1, String[] s2) {
                int answer = 0;
                for (int i = 0; i < s1.length; i++) {

                    for (int j = 0; j < s2.length; j++) {
                        if (s1[i].equals(s2[j])) {
                            answer++;
                        }
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new String[]{"a", "b", "c"},new String[]{"com", "b", "d", "p", "c"});
    }
}