package baekjoon.silver.four.주몽;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            N(재료의 개수), M(갑옷이 되는 번호) 저장하기
            for(N만큼 반복) {
                재료 배열 저장하기
            }
            재료 배열 정렬하기
            while(i < j) {
                if(재료 합 < M) 작은 번호 재료를 한 칸 위로 변경
                else if (재료 합 > M) 큰 번호 재료를 한 칸 아래로 변경
                else 경우의 수 증가, 양쪽 index 각각 변경
            }
            count 출력
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int count = 0;
        int i = 0;
        int j = N-1;

        for (int k = 0; k < N; k++) {
            A[k] = scanner.nextInt();
        }

        Arrays.sort(A);

        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }
}
