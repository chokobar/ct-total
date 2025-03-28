package foundation.codingTest;

public class Test37 {

    public static void main(String[] args) {
        /*
         * 날짜 비교하기
         *
         * 문제 설명
         * 만약 date1이 date2보다 앞서는 날짜라면 1을,
         * 아니면 0을 return 하는 solution 함수를 완성해 주세요.
         *
         *
         * date1	        date2	            result
         * [2021, 12, 28]	[2021, 12, 29]	    1
         * [1024, 10, 24]	[1024, 10, 24]	    0
         *
         * 입출력 예 #1
         * date1이 date2보다 하루 앞서기 때문에 1을 return 합니다.
         *
         * 입출력 예 #2
         * date1과 date2는 날짜가 서로 같으므로 date1이 더 앞서는 날짜가 아닙니다. 따라서 0을 return 합니다.
         *
         */
        class Solution {
            public int solution(int[] date1, int[] date2) {
                int answer = 0;
                String result01 = "";
                String result02 = "";
                for (int i = 0; i < date1.length; i++) {
                    result01 += date1[i];
                }
                for (int i = 0; i < date2.length; i++) {
                    result02 += date2[i];
                }
                if (Integer.parseInt(result01) > Integer.parseInt(result02)) {
                    answer = 0;
                } else if (Integer.parseInt(result01) == Integer.parseInt(result02)
                        || Integer.parseInt(result01) < Integer.parseInt(result02)) {
                    answer = 1;
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24});
    }
}
