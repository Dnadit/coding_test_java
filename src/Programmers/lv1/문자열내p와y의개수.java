package Programmers.lv1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pcnt = 0;
        int ycnt = 0;
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("p")) {
                pcnt++;
            }
            if (arr[i].equals("y")) {
                ycnt++;
            }
        }
        if (pcnt != ycnt) {
            answer = false;
        }
        return answer;
    }
}
