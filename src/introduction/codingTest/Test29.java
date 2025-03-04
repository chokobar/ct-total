package introduction.codingTest;


public class Test29 {

    public static void main(String[] args) {
        /*
         * 짝수 홀수 개수
         *
         * 문제 설명
         * 정수가 담긴 리스트 num_list가 주어질 때,
         * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         *
         *
         * 입출력 예 #1
         * [1, 2, 3, 4, 5]에는 짝수가 2, 4로 두 개, 홀수가 1, 3, 5로 세 개 있습니다.
         *
         * 입출력 예 #2
         * [1, 3, 5, 7]에는 짝수가 없고 홀수가 네 개 있습니다.
         *
         */
        class Solution {
            public int[] solution(int[] num_list) {
                int[] answer = new int[2];
                for (int num : num_list) {
                    if (num % 2 == 0) {
                        answer[0]++;
                    } else {
                        answer[1]++;
                    }
                }
                return answer;
            }
        }
    }
}