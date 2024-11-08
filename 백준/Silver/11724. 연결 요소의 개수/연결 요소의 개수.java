import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visitArr;

    public static void main(String[] args) throws IOException {
        /*
        n(노드 개수) m(에지 개수)
        A(인접 리스트)
        visitArr(방문 배열)
        navArr(탐색 배열)

        for(n만큼) {
            A의 각 ArrayList 초기화 -> 왜 하는거지?
        }

        for(m만큼) {
            A에 데이터 저장
        }

        for(n만큼) {
            if(방문하지 않은 노드가 있으면 {
                연결 요소 개수++
                DFS 실행
            }
        }

        // DFS
        DFS {
            if(현재 노드 == 방문 노드) return;
            visitArr 배열에 현재 노드 방문 기록
            현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행(재귀 함수 형태)
        }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        visitArr = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            //에지의 양끝 점
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            A[u].add(v);
            A[v].add(u);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!visitArr[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    static void DFS(int v) {
        if (visitArr[v]) {
            return;
        }

        visitArr[v] = true;

        for (int i : A[v]) {
            if (visitArr[i] == false) {
                DFS(i);
            }
        }

    }
}