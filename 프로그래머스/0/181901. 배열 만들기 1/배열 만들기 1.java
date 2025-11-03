import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i=k; i<=n; i+=k) {
            arrayList.add(i);
        }
        
        int[] answer = new int[arrayList.size()];
        for(int j=0; j<arrayList.size(); j++) {
            answer[j]=arrayList.get(j);
        }
        
        return answer;
    }
}