package lv2.x만큼_간격이_있는_n개의_숫자;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int x = 4;
        int n = 3;
        System.out.println(Arrays.toString(solution(x, n)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<answer.length; i++){
            answer[i]=(long) (i+1) * x;
        }
        return answer;
    }
}