import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> result = new ArrayList<>();
        
        for(int i=0; i<names.length; i+=5){
            result.add(names[i]);
        }
        
        String[] answer = new String[result.size()];
        for(int j=0; j<result.size(); j++){
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}