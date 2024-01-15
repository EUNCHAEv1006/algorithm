package programmers.lv1.배열의_평균값;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(numbers));
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        int tot=0;
        for(int i=0; i<numbers.length; i++) {
            tot+=numbers[i];
        }
        answer=(double) tot/numbers.length;
        return answer;
    }
}