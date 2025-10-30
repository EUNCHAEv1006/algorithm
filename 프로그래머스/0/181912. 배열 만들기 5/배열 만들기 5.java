import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int x = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(k<x) {
                answer.add(x);
            }
        }
        
        
        int[] result = new int[answer.size()];
        
        for(int j=0; j<answer.size(); j++){
            result[j] = answer.get(j);
        }
        
        return result;
    }
}