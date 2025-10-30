import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            arrayList.add(my_string.substring(i));
        }
        
        String[] answer = new String[arrayList.size()];
        Collections.sort(arrayList);
        for(int j=0; j<my_string.length(); j++) {
            answer[j] = arrayList.get(j);
        }
        
        return answer;
    }
}