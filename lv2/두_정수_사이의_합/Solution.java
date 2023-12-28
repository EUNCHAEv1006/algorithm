package lv2.두_정수_사이의_합;

public class Solution {
    public static void main(String[] args) {
//        int a = 3;
        int a = 5;
//        int b = 5;
        int b = 3;
        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a == b) {
            answer = a;
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }


        return answer;
    }
}