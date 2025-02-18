import java.util.Scanner;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        prime = new boolean[N + 1];
        getPrime();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) System.out.println(i);
        }
    }

    private static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}


