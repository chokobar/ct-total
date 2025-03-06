package introduction.codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test33 {

    public static void main(String[] args) {
        /*
         * 7의 개수
         *
         * 문제 설명
         * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
         * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * [7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
         *
         * 입출력 예 #2
         * [10, 29]에는 7이 없으므로 0을 return 합니다.
         *
         */
        class Solution {
            public int solution(int[] array) {
                int answer = 0;
                String str = Arrays.toString(array);
                String[] split = str.split("");
                for (String string : split) {
                    if (string.equals("7")) {
                        answer++;
                    }
                }
                return answer;
            }
        }
    }
}