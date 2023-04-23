package BaekJoon.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int changeNum = Integer.parseInt(st.nextToken());
        int[] bucket = new int[n];
        // bucket 초기화 [1,2,3,4,5]
        for (int i = 1; i <= n; i++) {
            bucket[i-1] = i;
        }
        // 바꾸기
        for (int i = 0; i < changeNum; i++) {
            st = new StringTokenizer(br.readLine());
            int bucket1 = Integer.parseInt(st.nextToken())-1;
            int bucket2 = Integer.parseInt(st.nextToken())-1;
            int temp = bucket[bucket1];
            bucket[bucket1] = bucket[bucket2];
            bucket[bucket2] = temp;
        }
        for (int i : bucket) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
