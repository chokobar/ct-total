package introduction.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test49 {

    public static void main(String[] args) {
        /*
         * k의 개수
         *
         * 문제 설명
         * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
         * 정수 i, j, k가 매개변수로 주어질 때,
         * i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * 본문과 동일합니다.
         *
         * 입출력 예 #2
         * 10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.
         * 10 11 12 13 14 15 16 17 18 19 20
         *
         * 입출력 예 #3
         * 3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.
         *
         *
         * i	j	    k	result
         * 1	13	    1	6
         * 10	50	    5	5
         * 3	10	    2	0
         *
         */
        class Solution {
            public int solution(int num, int k) {
                int answer = 0;
                String[] strNum = String.valueOf(num).split("");
                for (int i = 0; i < strNum.length; i++) {
                    if (strNum[i].equals(String.valueOf(k))) {
                        answer = i+1;
                        break;
                    } else {
                        answer = -1;
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(1,1);
    }
}