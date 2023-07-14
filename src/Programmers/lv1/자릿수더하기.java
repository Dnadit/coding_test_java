package Programmers.lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] arr = num.split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
