package introduction.codingTest;

public class Test09 {

    public static void main(String[] args) {
        /*
        * 문제 설명
        * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
        *
        * 입출력 예 설명
        * 입출력 예 #1
        * numbers의 원소들의 평균 값은 5.5입니다.
        * 입출력 예 #2
        * numbers의 원소들의 평균 값은 94.0입니다.
        */
        class Solution {
            public double solution(int[] numbers) {
                double answer = 0;
                double sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum = sum + numbers[i];
                    answer = sum / numbers.length;
                }
                return answer;
            }
        }
    }
}
