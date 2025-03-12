package introduction.codingTest;

import java.util.Arrays;

public class Test47 {

    public static void main(String[] args) {
        /*
         * 문자열 정렬하기(1)
         *
         * 문제 설명
         * 문자열 my_string이 매개변수로 주어질 때,
         * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
         *
         * 입출력 예 #1
         * "hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.
         *
         * 입출력 예 #2
         * "p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.
         *
         * 입출력 예 #3
         * "abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.
         *
         * my_string	result
         * "hi12392"	[1, 2, 2, 3, 9]
         * "p2o4i8gj2"	[2, 2, 4, 8]
         * "abcde0"	    [0]
         */
        class Solution {
            public int[] solution(String my_string) {
                my_string = my_string.replaceAll("[a-z]", "");

                String[] arr = my_string.split("");
                int[]answer = new int[arr.length];

                for (int i = 0; i < arr.length; i++) {
                    answer[i] = Integer.parseInt(arr[i]);
                }
                Arrays.sort(answer);

                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("hi12392");
    }
}