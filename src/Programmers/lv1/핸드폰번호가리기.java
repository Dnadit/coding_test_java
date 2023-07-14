package Programmers.lv1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        String first = phone_number.substring(0, phone_number.length() - 4);
        String last = phone_number.substring(phone_number.length() - 4, phone_number.length());
        for (int i = 0; i < first.length(); i++) {
            answer += "*";
        }
        answer += last;
        return answer;
    }
}
