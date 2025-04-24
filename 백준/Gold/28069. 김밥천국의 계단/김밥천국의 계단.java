import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N, K) ? "minigimbob" : "water");
    }

    private static boolean bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int[] cnt = new int[n + 1];

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if(now == n && cnt[now] <= k) {
                return true;
            }
            
            if (cnt[now] == k) {
                continue;
            }

            int walk = now + 1;
            if (walk <= n && cnt[walk] == 0) {
                cnt[walk] = cnt[now] + 1;
                queue.add(walk);
            }

            int jump = now + now / 2;
            if (jump <= n && cnt[jump] == 0) {
                cnt[jump] = cnt[now] + 1;
                queue.add(jump);
            }

        }

        return false;
    }

}
