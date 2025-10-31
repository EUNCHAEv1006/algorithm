import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> my_stringPrefix = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            my_stringPrefix.add(my_string.substring(0, my_string.length()-i));
            
            if(my_stringPrefix.get(i).equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}