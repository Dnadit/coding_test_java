package Programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (prev != arr[i]) {
                list.add(arr[i]);
                prev = arr[i];
            }
        }
        return list;
    }
}
