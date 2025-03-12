package introduction.codingTest;

public class Test50 {

    public static void main(String[] args) {
        /*
         * 숫자 찾기
         *
         * 문제 설명
         * 정수 num과 k가 매개변수로 주어질 때,
         * num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를
         * return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * 29183에서 1은 3번째에 있습니다.
         *
         * 입출력 예 #2
         * 232443에서 4는 4번째에 처음 등장합니다.
         *
         * 입출력 예 #3
         * 123456에 7은 없으므로 -1을 return 합니다.
         *
         *
         * num	    k	result
         * 29183	1	3
         * 232443	4	4
         * 123456	7	-1
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
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(29183,1);
    }
}