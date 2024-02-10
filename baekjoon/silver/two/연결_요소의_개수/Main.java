package baekjoon.silver.two.연결_요소의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        /*
        n(노드 개수) m(에지 개수)
        A(그래프 데이터 저장 인접 리스트)
        visited(방문 기록 저장 배열)
        for(n의 개수만큼 반복하기) {
            A 인접 리스트의 각 ArrayList 초기화하기
        }
        for(n의 개수만큼 반복하기) {
            if(방문하지 않은 노드가 있으면) {
                연결 요소 개수++
                DFS 실행하기
            }
        }

        // DFS 구현하기
        DFS {
            if(현재 노드 == 방문 노드) return;
            visited 배열에 현재 노드 방문 기록하기
            현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 형태)
        }
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        visited = new boolean[n + 1]; // <- 배열에서 0번 인덱스를 사용하면 헷갈릴 것 같아서 n+1
        A = new ArrayList[n + 1];

        // 인접 리스트의 왼쪽(?) 부분
        for (int i=1; i<n+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        // 인접 리스트 넣는 부분 (오른쪽 부분)
        for (int i=0; i<m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken()); // 시작점
            int e = Integer.parseInt(stringTokenizer.nextToken()); // 종료점
            A[s].add(e); // 시작점에서 종료점으로 갈 수 있고
            A[e].add(s); // 종료점에서 시작점으로 갈 수도 있다. 문제에서 방향이 없었기 때문에 양방향으로 add 해줘야함
        }

        int count = 0;

        for (int i=1; i<n+1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
