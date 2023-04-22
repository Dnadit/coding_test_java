package BaekJoon.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int result = numbers[0];
        int indexNum = 1;
        for (int i = 1; i < 9; i++) {
            if (result < numbers[i]) {
                result = numbers[i];
                indexNum = i+1;
            }
        }
        System.out.println(result + "\n" + indexNum);
    }
}
