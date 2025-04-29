import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeN = Integer.parseInt(st.nextToken());
            int lineN = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int k = 0; k <= nodeN; k++) {
                graph.add(new ArrayList<Integer>());
            }
            int[] color = new int[nodeN + 1];

            for (int j = 0; j < lineN; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st1.nextToken());
                int end = Integer.parseInt(st1.nextToken());
                graph.get(start).add(end);
                graph.get(end).add(start);
            }
            ans = true;

            // 모든 정점을 탐색하며 방문되지 않은 정점에서 DFS 시작
            for (int node = 1; node <= nodeN; node++) {
                if (color[node] == 0) {
                    dfs(graph, color, node, 1);
                }
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> graph, int[] colors, int now, int color) {
        colors[now] = color;
        ArrayList<Integer> nexts = graph.get(now);

        for (int next : nexts) {
            if (colors[next] == colors[now]) {
                ans = false;
                return; // 이분 그래프가 아님을 확인한 경우 더 이상 탐색하지 않음
            }

            if (colors[next] == 0) {
                dfs(graph, colors, next, 3 - color);
            }
        }
    }
}