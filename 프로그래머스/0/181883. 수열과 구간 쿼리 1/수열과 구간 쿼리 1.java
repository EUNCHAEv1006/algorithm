import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            for(int i=s; i<=e; i++) {
                answer[i]++;
            }
        }
        
        return answer;
    }
}