package BaekJoon.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// HashSet 자료구조 사용하면, 중복원소를 허용하지 않음.
public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Integer[] arr2 = new Integer[10];
        int j = 0;
        for (Integer i : arr) {
            arr2[j] = i % 42;
            j++;
        }
        Arrays.sort(arr2);
        int cnt = 10;
        for (int i = 1; i < arr.length; i++) {
            if (arr2[i-1] == arr2[i]) {
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
