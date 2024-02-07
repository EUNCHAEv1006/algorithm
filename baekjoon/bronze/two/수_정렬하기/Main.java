package baekjoon.bronze.two.수_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            N(정렬할 수 개수)
            A(정렬할 배열 선언)
            for(i : 0 ~ N - 1) {
	              for(j : 0 ~ N - 1 - i) {
		                현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
                }
            }
            A 배열 출력
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        // 버블 정렬을 구현하는 영역
        for (int i=0; i<N-1; i++) {
            for (int j=0; j<N-1-i; j++) {
                if (A[j]>A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for (int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }
}
