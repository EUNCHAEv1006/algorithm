import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] > maxHeight) {
                    maxHeight = grid[i][j];
                }
            }
        }
        
        int maxSafeArea = 0; 
        for (int h = 0; h <= maxHeight; h++) {
            visited = new boolean[n][n];
            int safeAreaCount = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && grid[i][j] > h) {
                        dfs(i, j, h);
                        safeAreaCount++;
                    }
                }
            }
            maxSafeArea = Math.max(maxSafeArea, safeAreaCount);
        }
        
        System.out.println(maxSafeArea);
        sc.close();
    }
    
    public static void dfs(int x, int y, int h) {
        visited[x][y] = true;
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (!visited[nx][ny] && grid[nx][ny] > h) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}
