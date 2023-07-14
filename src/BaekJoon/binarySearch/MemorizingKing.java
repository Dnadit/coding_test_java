package BaekJoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MemorizingKing {
    private static int binarySearch(int start, int end, int target, int[] arr) {
        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] == target)
                return 1;
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }


    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N1 = Integer.parseInt(br.readLine());
            int[] note1 = new int[N1];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N1; j++) {
                note1[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(note1);
            int N2 = Integer.parseInt(br.readLine());
            int[] note2 = new int[N2];
            int start = 0;
            int end = note1.length-1;
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < N2; k++) {
                note2[k] = Integer.parseInt(st.nextToken());
                sb.append(binarySearch(start, end, note2[k], note1)).append("\n");
            }

        }
        System.out.println(sb);
    }
}
