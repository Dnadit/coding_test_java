package BaekJoon.HandleString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(arr[i].length()-1));
            System.out.println();
        }

    }
}
