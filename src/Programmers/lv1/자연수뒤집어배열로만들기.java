package Programmers.lv1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String[] arr = Long.toString(n).split("");
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[arr.length-1-i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
