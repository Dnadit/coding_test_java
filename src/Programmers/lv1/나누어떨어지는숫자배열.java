package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
}
