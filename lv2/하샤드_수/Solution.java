package lv2.하샤드_수;

import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int total = 0;

        String[] arr = Integer.toString(x).split("");

        for (String s : arr) {
            total += Integer.parseInt(s);
        }

        if (x % total != 0) {
            answer = false;
        }

        return answer;
    }
}