package introduction.codingTest;

public class Test31 {

    public static void main(String[] args) {
        /*
         * 가장큰수 찾기
         *
         * 문제 설명
         * 정수 배열 array가 매개변수로 주어질 때,
         * 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
         *
         * 입출력 예 #2
         * 9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.
         *
         */
        class Solution {
            public int[] solution(int[] array) {
                int[] answer = new int[2];
                int maxNumber  = 0;     //1     8      3
                int indexNumber = 0;    //0     1
                for (int i = 0; i < array.length; i++) {
                    if(maxNumber < array[i]) {      // 1    8
                        maxNumber = array[i];       // 1    8
                        indexNumber = i;            // 0    1
                    }
                }
                answer[0] = maxNumber;
                answer[1] = indexNumber;
                return answer;
            }
        }
    }
}