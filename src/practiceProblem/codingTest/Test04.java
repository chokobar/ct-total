package practiceProblem.codingTest;

public class Test04 {

    public static void main(String[] args) {
        /*
         * 평균 구하기
         *
         * 문제 설명
         * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
         *
         *  arr	        return
         * [1,2,3,4]	2.5
         * [5,5]	    5
         *
         *
         *
         */
        class Solution {
            public double solution(int[] arr) {
                double answer = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                answer = (double) sum / arr.length;
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{1, 2, 3, 4});
    }
}
