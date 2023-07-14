package Programmers.lv1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int start = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer += (s.charAt(start-1));
            answer += (s.charAt(start));
        } else {
            answer += (s.charAt(start));
        }
        return answer;
    }
}
