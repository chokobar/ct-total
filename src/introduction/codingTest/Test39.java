package introduction.codingTest;

import java.util.Arrays;

public class Test39 {

    public static void main(String[] args) {
        /*
         * 삼각형완성조건(1)
         *
         * 문제 설명
         * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
         * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
         * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * 가장 큰 변인 3이 나머지 두 변의 합 3과 같으므로 삼각형을 완성할 수 없습니다.
         * 따라서 2를 return합니다.
         *
         * 입출력 예 #2
         * 가장 큰 변인 6이 나머지 두 변의 합 5보다 크므로 삼각형을 완성할 수 없습니다.
         * 따라서 2를 return합니다.
         *
         * 입출력 예 #3
         * 가장 큰 변인 222가 나머지 두 변의 합 271보다 작으므로 삼각형을 완성할 수 있습니다. 따라서 1을 return합니다.
         *
         * code 값의 배수 예) 4이면 4, 8, 12, 16, 20, 24
         *
         *
         * [1, 2, 3]    max3 = 2+1 =	2
         * [3, 6, 2]	max6 > 2+3 =    2
         * [199, 72, 222]	max222 < 271 =  1
         */
        class Solution {
            public int solution(int[] sides) {
                int answer = 0;
                Arrays.sort(sides);
                int max = sides[0];
                for (int i = 0; i < sides.length; i++) {
                    if (max < sides[i]) {
                        max = sides[i];
                    }
                    if(max >= sides[0] + sides[1]){
                        answer = 2;
                    }else {
                        answer = 1;
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();

       sol.solution(new int[]{3, 6, 2	});
    }
}