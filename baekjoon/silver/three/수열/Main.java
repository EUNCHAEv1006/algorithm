package baekjoon.silver.three.수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            1. 입력 받기
                - N, K를 입력 받는다.
                - 배열 A를 입력 받는다.

            2. 초기화
                - i를 1로 초기화한다.
                - sum을 0으로 초기화한다.
                - max를 A 배열의 처음 K개 요소의 합으로 초기화한다.

            3. 처음 K개의 요소 합 구하기
               - while i <= K:
                   - sum += A[i]
                   - i를 1 증가시킨다.

            4. 최댓값 갱신
               - max를 sum으로 갱신한다.

            5. K개씩 이동하면서 최댓값 갱신
               - while i <= N:
                   - sum += A[i] - A[i - K]
                   - if max < sum, then max = sum
                   - i를 1 증가시킨다.

            6. 결과 출력
               - max를 출력한다.

         */


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[] A = new int[N+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int i = 1;
        int sum = 0;

        while (i<=K) {
            sum += A[i++];
        }

        int max = sum;

        while (i<=N) {
            sum += A[i]-A[i-K];
            if (max < sum) max = sum;
            i++;
        }

        System.out.println(max);
    }
}
