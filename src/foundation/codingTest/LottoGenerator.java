package foundation.codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LottoGenerator {
    public static void main(String[] args) {
        System.out.println("로또번호 생성기");

        int[] numbers = new int[6];
        Set<Integer> numberSet = new HashSet<>();

        while (numberSet.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            numberSet.add(num);
        }

        // Set을 배열로 변환
        int index = 0;
        for (int num : numberSet) {
            numbers[index++] = num;
        }

        // 결과 출력 (정렬된 로또 번호)
        Arrays.sort(numbers);
        System.out.println("로또 번호: " + Arrays.toString(numbers));
    }
}
