package introduction.codingTest;

public class Test13 {

    public static void main(String[] args) {
        /*
        * 배열 뒤집기
        *
        * 문제 설명
        * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
        *
        * 입출력 예 #1
        * num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
        *
        * 입출력 예 #2
        * num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
        *
        * 입출력 예 #3
        * num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
        */
        class Solution {
            public int[] solution(int[] num_list) {
                int[] answer = new int[num_list.length];
                for (int i = num_list.length -1 , j = 0; i >= 0; i--, j++) {
                    answer[j] = num_list[i];
                }
                return answer;
            }
        }
    }
}
