package foundation.codingTest;

public class Test15 {

    public static void main(String[] args) {
        /*
         * 문자리스트를 문자열로 변환하기
         *
         * 문제 설명
         * 문자들이 담겨있는 배열 arr가 주어집니다.
         * arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
         *
         * arr	            result
         * ["a","b","c"]	"abc"
         */

        class Solution {
            public String solution(String[] arr) {
                String answer = "";
                for (int i = 0; i < arr.length; i++) {
                    answer += arr[i];
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new String[]{"a","b","c"});

    }
}
