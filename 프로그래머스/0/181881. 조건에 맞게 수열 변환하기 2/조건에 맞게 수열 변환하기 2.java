import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] next = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];

                if (value >= 50 && value % 2 == 0) {
                    next[i] = value / 2;
                } else if (value < 50 && value % 2 == 1) {
                    next[i] = value * 2 + 1;
                } else {
                    next[i] = value;
                }
            }

            if (Arrays.equals(arr, next)) {
                break;
            }
            arr = next;
            answer++;
        }

        return answer;
    }
}