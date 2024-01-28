package baekjoon.silver.two.DNA_비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {

        /*
            // 데이터 저장
            S(문자열 크기) P(부분 문자열의 크기)
            A(문자열 데이터)
            checkArr(비밀번호 체크 배열)

            // 변수 선언
            myArr(현재 상태 배열)
            checkSecret(몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수)
            P 범위 ((0 ~ P-1)만큼 S배열에 적용하고, 유효한 비밀번호인지 판단)
            for(i를 P에서 S까지 반복) {
                j선언(i-P)
            }

            // 이 부분은 함수로 별도 구현하기
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char[] A = new char[S];
        checkSecret = 0;

        A = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i =0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if (checkSecret == 4) {
            Result++;
        }

        // 슬라이딩윈도우
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) {
                Result++;
            }
        }

        System.out.println(Result);
        bufferedReader.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
}
