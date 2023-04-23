package BaekJoon.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int examNum = Integer.parseInt(br.readLine());
        double[] score = new double[examNum];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < score.length; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score);
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += (score[i]/score[score.length-1]*100);
        }
        double result = sum / score.length;
        System.out.println(result);
    }
}
