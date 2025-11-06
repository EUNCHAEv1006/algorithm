import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> num_listArray = new ArrayList<>();
        
        for(int i=n-1; i<num_list.length; i++){
            num_listArray.add(num_list[i]);
        }
        
        int[] answer = new int[num_listArray.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = num_listArray.get(j);
        }
        
        return answer;
    }
}