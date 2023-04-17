package BaekJoon.ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input%400 == 0)
            System.out.println(1);
        else if (input%4 == 0 && input%100 != 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
