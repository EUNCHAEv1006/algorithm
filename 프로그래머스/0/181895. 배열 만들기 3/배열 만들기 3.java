import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int[] interval : intervals) {
            int s = interval[0];
            int e = interval[1];
            
            for(int i=s; i<=e; i++) {
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int j=0; j<result.size(); j++){
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}