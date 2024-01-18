package baekjoon.silver.three.구간_합_구하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            suNo개의 수 입력받기
            for(suNo 개수만큼) {
                합 배열 구하기 : S[i] = S[i-1] + A[i]
           }
           for(질의 개수만큼 반복) {
                구간 i, j 입력 받기
                구간 합 구하기: S[j] - S[i-1]
           }
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo + 1]; // 인덱스가 1부터 시작하기 때문

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 합배열
        for (int i = 1; i<=suNo; i++) {
            S[i] = S[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q<quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j]-S[i-1]);
        }
    }
}
