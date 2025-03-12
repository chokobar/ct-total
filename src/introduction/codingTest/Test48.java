package introduction.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test48 {

    public static void main(String[] args) {
        /*
         * 모음제거
         *
         * 문제 설명
         * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
         * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 #1
         * "bus"에서 모음 u를 제거한 "bs"를 return합니다.
         *
         * 입출력 예 #2
         * "nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
         *
         *
         * my_string	        result
         * "bus"	            "bs"
         * "nice to meet you"	"nc t mt y"
         *
         */
        class Solution {
            public String solution(String my_string) {
                String answer = "";

                String[] minusWords = {"a","i", "o", "e", "u"};
                String[] arr = my_string.split("");
                List<String> arrList = new ArrayList<>(Arrays.asList(arr));
                List<String> minusList = Arrays.asList(minusWords);
                arrList.removeAll(minusList);
                for (int i = 0; i < arrList.size(); i++) {
                    answer += arrList.get(i) + "";
                }
                return answer;

            }
        }

        Solution sol = new Solution();
        sol.solution("nice to meet you");
    }
}