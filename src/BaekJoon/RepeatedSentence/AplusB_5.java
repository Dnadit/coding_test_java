package BaekJoon.RepeatedSentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int plus = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if (plus == 0)
                break;
            sb.append(plus).append("\n");
        }

        System.out.println(sb);
    }
}
