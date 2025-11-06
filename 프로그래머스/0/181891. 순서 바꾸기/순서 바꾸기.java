import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> front = new ArrayList<>();
        ArrayList<Integer> back = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=n; i<num_list.length; i++){
            back.add(num_list[i]);
            result.add(num_list[i]);
        }
        
        for(int i=0; i<n; i++){
            front.add(num_list[i]);
            result.add(num_list[i]);
        }
        
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}