package Programmers.lv1;

public class 부족한금액계산하기 {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            money -= price * i;
        }
        if (money < 0) {
            answer -= money;
        }
        return answer;
    }
}
