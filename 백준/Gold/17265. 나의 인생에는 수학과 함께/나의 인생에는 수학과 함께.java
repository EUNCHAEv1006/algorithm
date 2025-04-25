import java.io.*;

public class Main {
    static int max = -99999, min = 99999;
    static int N;
    static char map[][] = new char[5][5];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void DFS(int i, int j, int nowResult, char operator) throws IOException {
        if (i >= N || j >= N) {
            return;
        }
        // i+j가 짝수이면 숫자, 홀수이면 기호
        if ((i + j) % 2 == 0) {
            if (operator == '+') {
                nowResult += Character.getNumericValue(map[i][j]);
            }
            if (operator == '-') {
                nowResult -= Character.getNumericValue(map[i][j]);
            }
            if (operator == '*') {
                nowResult *= Character.getNumericValue(map[i][j]);
            }
            // 옆이랑 아래로 각각 N-1번 이동했으면 학교 도착 완료. 최대 최소값 비교 후 끝
            if (i == N - 1 && j == N - 1) {
                if (max < nowResult)
                    max = nowResult;
                if (min > nowResult)
                    min = nowResult;
                return;
            }
            // 아직 더 이동해야함
            else {
                DFS(i + 1, j, nowResult, '0');
                DFS(i, j + 1, nowResult, '0');
            }
        } // 기호일 때
        else {
            DFS(i + 1, j, nowResult, map[i][j]);
            DFS(i, j + 1, nowResult, map[i][j]);
        }

    }

    public static void main(String[] args) throws IOException {
        // 연산 결과의 범위는 5가 5번 곱해지는게 가장 큰 값, 0에서 5를 4번 빼는게 가장 작은 값임

        N = Integer.parseInt(br.readLine());

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = input[j].charAt(0);
            }
        }

        DFS(0, 0, Character.getNumericValue(map[0][0]), '0');

        bw.write(max + " " + min);
        bw.flush();
        bw.close();
    }
}