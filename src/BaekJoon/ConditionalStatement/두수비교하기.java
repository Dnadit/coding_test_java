package BaekJoon.ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 두수비교하기 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] anb = input.split(" ");
        int a = Integer.parseInt(anb[0]);
        int b = Integer.parseInt(anb[1]);

        if (a > b)
            System.out.println(">");
        if (a < b)
            System.out.println("<");
        if (a == b)
            System.out.println("==");
    }
}
