package Programmers.lv1;

public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (num == 1) {
                answer = 0;
                break;
            }
            if (answer == 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }
        }

        return answer;
    }
}
