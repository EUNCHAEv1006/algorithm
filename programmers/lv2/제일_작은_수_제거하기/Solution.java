package programmers.lv2.제일_작은_수_제거하기;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            int min = Integer.MAX_VALUE;
            for (int n : arr) {
                min = Math.min(n, min);
            }

            int[] answer = new int[arr.length - 1];

            int index = 0;
            for (int n : arr) {
                if (n != min) {
                    answer[index++] = n;
                }
            }

            return answer;
        }
    }
}