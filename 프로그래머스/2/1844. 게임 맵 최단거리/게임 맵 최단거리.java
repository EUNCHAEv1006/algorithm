import java.util.*;

class Solution {
    
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        int distance = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int s=0; s<size; s++){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                
                if(x==n-1&&y==m-1) {
                    return distance;
                }
                
                for(int i=0; i<4; i++){
                    int nx = x+dx[i];
                    int ny = y+dy[i];
                    
                    if(nx<0||ny<0||nx>=n||ny>=m) continue;
                    if(visited[nx][ny]) continue;
                    if(maps[nx][ny]==0) continue;
                    
                    visited[nx][ny]=true;
                    q.offer(new int[]{nx, ny});
                }
            }
            distance++;
        }
        return -1;
    }
}