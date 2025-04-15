package practiceProblem.codingTest;

import java.util.Arrays;
import java.util.Collections;

public class Test09 {

    public static void main(String[] args) {
        /*
         * 정수 내림차순으로 정렬하기
         *
         * 문제 설명
         * 함수 solution은 정수 n을 매개변수로 입력받습니다.
         * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
         * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
         *
         *
         *  n	    return
         *  118372	873211
         *
         *
         */
        class Solution {
            public long solution(long n) {
                String str = Long.toString(n);

                String[] arr = str.split("");

                Arrays.sort(arr, Collections.reverseOrder());

                StringBuilder sb = new StringBuilder();
                for (String s : arr) {
                    sb.append(s);
                }
                return Long.parseLong(sb.toString());
            }
        }

        Solution sol = new Solution();
        sol.solution(118372);
    }
}
