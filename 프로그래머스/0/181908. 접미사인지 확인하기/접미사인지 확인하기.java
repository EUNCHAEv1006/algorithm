import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> my_stringArray = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            my_stringArray.add(my_string.substring(i));
            
            if(my_stringArray.get(i).equals(is_suffix)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}