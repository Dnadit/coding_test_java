package BaekJoon.HandleString;

import java.util.Scanner;

public class CharactersAndstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int i = Integer.parseInt(sc.nextLine());
        System.out.println(word.charAt(i-1));
    }

}
