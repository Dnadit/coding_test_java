package BaekJoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            //for (int j = i; j >= 0; j--) {
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
