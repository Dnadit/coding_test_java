package Programmers.lv1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = false;
        int plus = 0;
        String[] arr = Integer.toString(x).split("");
        for (int i = 0; i < arr.length; i++) {
            plus += Integer.parseInt(arr[i]);
        }
        if (x % plus == 0) {
            answer = true;
        }
        return answer;
    }
}
