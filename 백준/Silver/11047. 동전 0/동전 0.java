import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        N(동전 개수) K(목표 금액)
        A(동전 데이터 배열)

        for(N만큼 반복하기) {
            A 배열 저장하기
        }

        for(N만큼 반복 -> N-1 ~ 0으로 역순으로 반복하기) {
            if(현재 K보다 동전 가치가 작으면) {
                동전 수 += 목표 금액/현재 동전 가치
                목표 금액 = 목표 금액 % 현재 동전 가치
            }
        }
        누적된 동전 수 출력하기
         */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) {
                count += (K / A[i]);
                K %= A[i];
            }
        }
        System.out.println(count);
    }
}