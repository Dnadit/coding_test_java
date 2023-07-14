package Programmers.lv1;

import java.util.Arrays;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {a, b};
        Arrays.sort(arr);
        for (int i = arr[0]; i <= arr[1]; i++) {
            answer += i;
        }
        return answer;
    }
}
