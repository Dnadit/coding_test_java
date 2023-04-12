package BaekJoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 코딩은체육과목입니다 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = "";
        for (int i = 0; i < N/4; i++)
            s += "long ";
        s += "int";

        System.out.println(s);
    }
}
