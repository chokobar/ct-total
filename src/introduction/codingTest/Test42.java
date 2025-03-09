package introduction.codingTest;

import java.util.Arrays;

public class Test42 {

    public static void main(String[] args) {
        /*
         * 배열의 유사도
         *
         * 문제 설명
         * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때
         * 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * "b"와 "c"가 같으므로 2를 return합니다.
         *
         * 입출력 예 #2
         * 같은 원소가 없으므로 0을 return합니다.
         *
         * ["a", "b", "c"]	["com", "b", "d", "p", "c"]
         *
         */
        class Solution {
            public int solution(String[] s1, String[] s2) {
                int answer = 0;
                for (int i = 0; i < s1.length; i++) {
                    //System.out.print(s1[i]);
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