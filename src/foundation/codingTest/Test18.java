package foundation.codingTest;

public class Test18 {

    public static void main(String[] args) {
        /*
         * 두 수의 연산값 비교하기
         *
         * 문제 설명
         * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
         * 12 ⊕ 3 = 123
         * 3 ⊕ 12 = 312
         * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
         * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
         *
         *
         * 입출력 예 #1
         * a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 364 이므로 364를 return 합니다.
         *
         * 입출력 예 #2
         * a ⊕ b = 912 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 912 이므로 912를 return 합니다.
         *
         *
         * a	b	    result
         * 2	91	    364
         * 91	2	    912
         *
         *
         */
        class Solution {
            public int solution(int a, int b) {
                int answer = 0;
                int plueNumber = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
                int mutiNumber = 2 * a * b;

                if (plueNumber > mutiNumber) {
                    answer = plueNumber;
                } else if (plueNumber < mutiNumber) {
                    answer = mutiNumber;
                } else {
                    answer = plueNumber;
                }
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(2, 91);

    }
}
