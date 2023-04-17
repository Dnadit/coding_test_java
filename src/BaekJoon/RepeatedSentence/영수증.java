package BaekJoon.RepeatedSentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산시에 타입은 더 큰 크기의 타입으로 자동형변환 하여 계산 됨.
// 1차원 배열 2개 쓰나 2차원배열 쓰나 메모리사용과 시간은 비슷함.
// Primitive Type 과 Reference Type 잘 구분하여 == , equals 사용하기!
public class 영수증 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Long x = Long.parseLong(br.readLine());
        Integer n = Integer.parseInt(br.readLine());
        Integer[][] item = new Integer[n][2];
        for (int i  = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0] = Integer.parseInt(st.nextToken());  // price
            item[i][1] = Integer.parseInt(st.nextToken());  // count
        }
        Long result = 0L;
        for (int i = 0; i < n; i++) {
            result += item[i][0] * item[i][1];
        }
        if (x.equals(result))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
