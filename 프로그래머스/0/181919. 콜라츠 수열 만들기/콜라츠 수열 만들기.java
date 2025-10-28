import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
        
        while(n!=1){
            if(n%2==0) {
                n /= 2;
            } else {
                n = (3*n+1);
            }
            answer.add(n);
        }
        
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}