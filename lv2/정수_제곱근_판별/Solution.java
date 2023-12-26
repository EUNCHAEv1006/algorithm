package lv2.정수_제곱근_판별;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;

        /*
        sqrt(x) : x에 원하는 수를 넣으면 제곱근을 구할 수 있음
        double 형식이 들어가야함
        */
        double x = Math.sqrt(n); // n의 제곱근을 x에 저장
        // 제곱근(x)이 정수인지 확인하기 위함
        if (x % 1 == 0) {
            /*
            pow(x, y) : x를 y만큼 곱해줌
            pow(x + 1, 2) = (x + 1) * (x + 1)
                          = (x + 1)^2
            */
            answer = (long) Math.pow(x + 1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}