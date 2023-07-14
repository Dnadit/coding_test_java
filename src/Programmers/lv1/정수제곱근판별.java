package Programmers.lv1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        Double sqrtN = Math.sqrt(n);
        if (sqrtN % 1 == 0) {
            answer += Math.pow(sqrtN+1, 2);
        } else {
            answer -= 1;
        }
        return answer;
    }
}
