package BaekJoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 아 못풀겠다 ~
// 사람들이 푼 것 봤는데 -1 +1의 의미를 모르겠다..
public class Budget {
//    public static int binarySearch(int[] arr, int total) {
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int total = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum <= total) {
            sb.append(arr[n-1]);
        } else {
//            sb.append(binarySearch(arr, total));
        }

        System.out.println(sb);
    }
}
