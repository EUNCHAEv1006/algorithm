package baekjoon.silver.one.미로_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1}; // 1: 오른쪽 탐색, -1: 왼쪽 탐색
    static int[] dy = {1, 0, -1, 0}; // 1: 아래로 탐색, -1: 위로 탐색
    static boolean[][] visited;
    static int[][] A;
    static  int N, M;
    public static void main(String[] args) throws IOException {

        /*
        dx, dy(상하좌우를 탐색하기 위한 define값 정의 변수)
        A(데이터 저장 2차원 행렬)
        N(row), M(column)
        visited(방문 기록 저장 배열)
        A 배열 초기화하기
        visited 배열 초기화하기

        // 문제 DATA 받는 부분
        for(N의 개수만큼 반복하기) {
            for(M의 개수만큼 반복하기) {
                A 배열에 데이터 저장하기
            }
        }

        BFS(0, 0) 실행하기
        BFS{ // BFS 구현하기
            큐 자료구조에 시작 노드 삽입하기(add 연산)
            visited 배열에 현재 노드 방문 기록하기
            while(큐가 비어 있을 때까지) {
                큐에서 노드 데이터를 가져오기(poll 연산)
                for(상하좌우 탐색) {

                    // 1. 배열을 아예 빠져나가면 안된다
                    // 2. data가 0이면 안된다
                    // 3. 이미 방문한 노드이면 안된다
                    if(유효한 좌표) {
                        if(이동할 수 있는 칸이면서 방문하지 않은 노드) {

                            visited 배열에 방문 기록하기
                            A 배열에 depth를 현재 노드의 depth + 1로 업데이트하기
                            큐에 데이터 삽입하기(add 연산)
                        }
                    }
                }
            }
        }
         */


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        // Data받고 A배열(2차원 배열)에 넣기
        for (int i=0; i<N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken(); // 이렇게하면 한 줄이 쫙 받아진다.
            for (int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0, 0);
        System.out.println(A[N-1][M-1]); // 인덱스가 0부터 시작하니까 -1해주는게 맞다?
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k=0; k<4; k++) { // 상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x>=0 && y>=0 && x<N && y<M) { // 배열을 넘어가면 안되고
                    if (A[x][y] != 0 && !visited[x][y]) { // 방문했던 곳이면 안되고
                        // 이제 갈 수 있는 곳~ -> 탐색!
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
    }
}
