package foundation.codingTest;

import java.util.Scanner;

public class Test09 {

    public static void main(String[] args) {
        /*
         * 문자열 붙여서 출력하기
         *
         * 문제 설명
         * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
         * 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
         *
         */

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a + b);

    }
}
