import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] P = new int[N];
        int[] S = new int[N]; //합배열

        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        // 삽입 정렬
        for (int i = 1; i < N; i++) {
            int point = i;
            int value = P[i];

            for (int j = i - 1; j >= 0; j--) {
                if (P[j] < P[i]) {
                    point = j + 1;
                    break;
                }
                if (j == 0) {
                    point = 0;
                }
            }
            for (int j = i; j > point; j--) {
                P[j] = P[j - 1];
            }
            P[point] = value;
        }


        int sum = 0;

        S[0] = P[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + P[i];
        }

        for (int i = 0; i < N; i++) {
            sum += S[i];
        }

        System.out.println(sum);
    }
}