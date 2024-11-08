import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        /*
        N(노드 개수) M(에지 개수)
        A(그래프 데이터 저장 인접 리스트)
        visited(방문 기록 저장 배열)
        arrive(도착 확인 변수. boolean)

        for(N만큼) {
            A 인접 리스트의 각 ArrayList 초기화하기
        }

        for(M만큼) {
            A 인접 리스트에 그래프 데이터 저장하기
        }

        for(N만큼) {
            각 노드마다 DFS 실행
            if(arrive) 반복문 종료 == depth가 5에 도달한 적이 있다면
        }

        if(arrive) 1 출력
        else 0 출력

        // DFS 구현하기
        DFS {
            if(길이가 5 || arrive) {
                arrive = true;
                함수 종료
            }

            방문 배열에 현재 노드 방문 기록하기
            현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(호출마다 depth는 1씩 증가)
        }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (arrive) break;
        }

        if (arrive) System.out.println("1");
        else System.out.println("0");
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;

        for (int i : A[now]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }

        visited[now] = false;
    }
}