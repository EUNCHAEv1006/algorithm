import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] arr = new long[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextLong();
        }

        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < N; i++) {
            int start_index = 0;
            int end_index = N - 1;

            while (start_index < end_index) {
                if (start_index == i) { 
                    start_index++;
                    continue;
                }
                if (end_index == i) {
                    end_index--;
                    continue;
                }

                long sum = arr[start_index] + arr[end_index];

                if (sum == arr[i]) {
                    count++;
                    break;
                } else if (sum < arr[i]) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }

        System.out.println(count);
    }
}
