package BaekJoon.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험성적 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input >= 90)
            System.out.println("A");
        else if (input >= 80)
            System.out.println("B");
        else if (input >= 70)
            System.out.println("C");
        else if (input >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
