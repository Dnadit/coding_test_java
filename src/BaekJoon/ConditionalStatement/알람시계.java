package BaekJoon.ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int minusMin = min - 45;

        if (minusMin < 0) {
            min = 60 - minusMin*-1;
            hour -= 1;
            if (hour < 0) {
                hour = 24 - hour*-1;
            }
        } else
            min -= 45;
        System.out.println(hour + " " + min);
    }
}
