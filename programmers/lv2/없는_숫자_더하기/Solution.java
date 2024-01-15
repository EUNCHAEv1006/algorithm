package programmers.lv2.없는_숫자_더하기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}