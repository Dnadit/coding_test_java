package BaekJoon.RepeatedSentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        String str;

        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str);
            int plus = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append(plus).append("\n");
        }

        System.out.println(sb);
    }
}
