package foundation.codingTest;

import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        /*
         * 문자열 반복해서 출력하기
         *
         * 문제 설명
         * 문자열 str과 정수 n이 주어집니다.
         * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
         *
         */

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
