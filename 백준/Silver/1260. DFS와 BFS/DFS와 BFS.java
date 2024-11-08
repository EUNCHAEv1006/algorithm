import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        /*
        N(노드의 개수) M(에지의 개수) V(탐색을 시작할 노드의 번호)
        A(인접 데이터 배열) visited(방문 기록 배열. boolean)

        for(N만큼) {
            A 초기화
        }

        for(M만큼) {
            s(시작 노드)
            e(마지막 노드)
            A 데이터 저장
        }

        for(N만큼) {
            A 정렬
        }

        visited 초기화
        DFS(i)

        visited 초기화
        BFS(i)

        DFS(시작 노드) {
            현재 노드 출력하기
            visited 배열에 현재 노드 방문 기록하기
            현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행(재귀 함수)
        }

        BFS{
            큐 자료구조에 시작 노드 삽입(add)
            visited 배열에 현재 노드 방문 기록

            while(큐가 비어 있을 때까지) {
                큐에서 노드 데이터 가져오기(poll)
                가져온 노드 출력
                현재 노드의 연결 노드 중 미방문 노드를 큐에 삽입(add 연산)하고 방문 배열에 기록
            }
        }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        // 번호 작은게 먼저 방문해야해서 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(V);
        System.out.println();

        visited = new boolean[N + 1];
        BFS(V);
        System.out.println();
    }

    public static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int i : A[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            System.out.print(now_node + " ");

            for (int i : A[now_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}