package foundation.codingTest;

import java.util.Scanner;

public class Test08 {

    public static void main(String[] args) {
        /*
         * 덧셈식 출력하기
         *
         * 문제 설명
         * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
         *
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

    }
}
