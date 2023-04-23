package BaekJoon.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoNotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        Integer[] arr = new Integer[31];
        for (int i = 1; i < 29; i++) {
            int submitStudent = Integer.parseInt(br.readLine());
            arr[submitStudent] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null)
                System.out.println(i);
        }
    }
}
