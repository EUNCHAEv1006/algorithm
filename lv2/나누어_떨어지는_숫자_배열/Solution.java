package lv2.나누어_떨어지는_숫자_배열;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        int[] arr  = {5, 9, 7, 10};
//        int divisor = 5;
//        int[] arr  = {2, 36, 1, 3};
//        int divisor = 1;
        int[] arr  = {3, 2, 6};
        int divisor = 10;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                answerList.add(j);
            }
        }

        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}