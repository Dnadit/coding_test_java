package BaekJoon.ArrayOne;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
            if (arr[i] < x)
                sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
