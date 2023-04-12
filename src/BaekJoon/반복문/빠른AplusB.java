package BaekJoon.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른AplusB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int result = 0;
            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
