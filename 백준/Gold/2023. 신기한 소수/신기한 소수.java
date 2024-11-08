import java.io.*;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        /*
        N(자릿수)
        DFS 실행
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        // DFS 구현
        DFS(숫자, 자릿수) {
            if(자릿수 == N) {
                if(소수) 수 출력하기
                탐색 종료
            }

            for(1~9 반복하기) {
                if(뒤에 붙는 수가 홀수이면서 소수일 때)
                DFS(현재 수 * 10 + i, 자릿수 + 1) // 자릿수 1씩 늘리면서 DFS 실행
            }
        }

        // 소수 구하기 함수
        for('2 ~ 현재 수 / 2' 반복하기) {
            if(나머지가 0이면) return 소수가 아님
        }
        return 소수임
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    public static void DFS(int num, int jaritsu) {
        if (jaritsu == N) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) continue;

            //소수라면 재귀 함수로 자릿수를 늘림
            if (isPrime(num * 10 + i)) {
                DFS(num * 10 + i, jaritsu + 1);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}