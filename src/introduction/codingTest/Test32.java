package introduction.codingTest;

import java.util.Scanner;

public class Test32 {

    public static void main(String[] args) {
        /*
         * 직각삼각형 출력하기
         *
         * 문제 설명
         * "*"의 높이와 너비를 1이라고 했을 때,
         * "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
         * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
         *
         * 입출력 예 #1
         * n이 3이므로 첫째 줄에 * 1개, 둘째 줄에 * 2개, 셋째 줄에 * 3개를 출력합니다.
         *
         */
         class Solution {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}