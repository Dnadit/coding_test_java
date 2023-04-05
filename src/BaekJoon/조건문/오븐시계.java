package BaekJoon.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오븐시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer hour = Integer.parseInt(st.nextToken());
        Integer min = Integer.parseInt(st.nextToken());
        Integer cookingTime = Integer.parseInt(br.readLine());

        Integer newHour = hour;
        Integer newMin = min;

        newMin += cookingTime;
        if (newMin/60 >= 1) {
            newHour += newMin/60;
            newMin %= 60;
            if (newHour >= 24) {
                newHour %= 24;
            }
        }
        System.out.println(newHour + " " + newMin);
    }
}
