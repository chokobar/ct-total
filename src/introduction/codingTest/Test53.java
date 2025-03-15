package introduction.codingTest;

public class Test53 {

    public static void main(String[] args) {
        /*
         * 가위바위보
         *
         * 문제 설명
         * 가위는 2 바위는 0 보는 5로 표현합니다.
         * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
         * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을
         * return하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * "2"는 가위이므로 바위를 나타내는 "0"을 return 합니다.
         *
         * 입출력 예 #2
         * "205"는 순서대로 가위, 바위, 보이고 이를 모두 이기려면 바위, 보,
         * 가위를 순서대로 내야하므로 “052”를 return합니다.
         *
         * rsp	    result
         * "2"	    "0"
         * "205"	"052"
         *
         */
        class Solution {
            public String solution(String rsp) {
                String answer = "";
                String[] arr = rsp.split("");

                for (int i = 0; i < rsp.length(); i++) {
                   if (arr[i].equals("0")) {
                       answer += "5";
                   }else if (arr[i].equals("2")) {
                       answer += "0";
                   }else if (arr[i].equals("5")) {
                       answer += "2";
                   }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("205");
    }
}