package Programmers.lv1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = m; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        for (int i = n; i <= n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
