import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            
            boolean onlyZeroAndFive = true;
            
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                
                if(ch != '0' && ch != '5') {
                    onlyZeroAndFive = false;
                    break;
                }
            }
            
            if(onlyZeroAndFive) {
                result.add(i);
            }
        }
        
        if(result.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}