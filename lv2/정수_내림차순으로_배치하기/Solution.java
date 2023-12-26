package lv2.정수_내림차순으로_배치하기;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s);
        }

        return Long.parseLong(stringBuilder.reverse().toString());
    }
}