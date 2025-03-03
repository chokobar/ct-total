package introduction.codingTest;


import java.util.HashMap;
import java.util.Map;

public class Test23 {

    public static void main(String[] args) {
        /*
         * 피자 나눠먹기(1)
         *
         * 문제 설명
         * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
         * 피자를 나눠먹을 사람의 수 n이 주어질 때,
         * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * "7명"이 최소 "한 조각"씩 먹기 위해서 최소 "1판"이 필요합니다.
         * 입출력 예 #2
         * "1명"은 최소 "한 조각"을 먹기 위해 "1판"이 필요합니다.
         * 입출력 예 #3
         * "15명"이 최소 "한 조각"씩 먹기 위해서 최소 "3판"이 필요합니다.
         *
         */
        class Solution {
            public int solution(int n) {
                int answer = 0;
                if(n % 7 == 0 ){
                    answer = n / 7;
                } else {
                    answer = n / 7 + 1;
                }
                return answer;
            }
        }
    }
}
