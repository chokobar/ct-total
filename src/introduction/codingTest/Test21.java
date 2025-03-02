package introduction.codingTest;

import java.util.Arrays;

public class Test21 {

    public static void main(String[] args) {
        /*
         * 짝수는 싫어요
         *
         * 문제 설명
         * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 #1
         * 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
         * 입출력 #1
         * 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
         *
         */
        class Solution {
            public int[] solution(int n) {
                int size = (n + 1) / 2;
                int[] answer = new int[size];
                int index = 0;
                for (int i = 1; i <= n; i += 2) {
                    answer[index++] = i;
                }
                return answer;
            }
        }
    }
}
