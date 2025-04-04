package foundation.codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Test50 {

    public static void main(String[] args) {
        /*
         * 문자열 잘라서 정렬하기
         *
         * 문제 설명
         * 문자열 myString이 주어집니다.
         * "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한
         * 배열을 return 하는 solution 함수를 완성해 주세요.
         * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
         *
         * myString	        result
         * "axbxcxdx"	    ["a","b","c","d"]
         * "dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]
         *
         *
         * 입출력 예 #1
         * myString을 "x"를 기준으로 자른 배열은 ["a","b","c","d"]이며,
         * 이 배열은 이미 사전순으로 정렬된 상태입니다.
         * 따라서 해당 배열을 return 합니다.
         *
         * 입출력 예 #2
         * myString을 "x"를 기준으로 자른 배열은 ["d","cc","bbb","aaaa"]이며,
         * 이 배열을 사전순으로 정렬하면 ["aaaa","bbb","cc","d"]입니다.
         * 따라서 해당 배열을 return 합니다.
         *
         */
        class Solution {
            public String[] solution(String myString) {
                String[] parts = myString.split("x", -1);

                ArrayList<String> nonEmptyPartsList = new ArrayList<>();
                for (String part : parts) {
                    if (!part.isEmpty()) {
                        nonEmptyPartsList.add(part);
                    }
                }

                String[] nonEmptyParts = nonEmptyPartsList.toArray(new String[0]);

                Arrays.sort(nonEmptyParts);

                System.out.println(Arrays.toString(nonEmptyParts));

                return nonEmptyParts;
            }

        }

        Solution sol = new Solution();
        sol.solution("axbxcxdx");
    }
}
