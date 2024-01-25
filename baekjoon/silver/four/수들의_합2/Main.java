package baekjoon.silver.four.수들의_합2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sum = 0;
        int start_index = 0;
        int end_index = 0;
        int count = 0;

        int[] A = new int[N];

        for (int i = 0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        while (true) {
            if (sum >= M) {
                sum -= A[start_index++];
            } else if (end_index == N) {
                break;
            } else {
                sum += A[end_index++];
            }

            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
