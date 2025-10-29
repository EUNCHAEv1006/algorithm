class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] my_stringArray = my_string.toCharArray();
        
        for(int i=0; i<index_list.length; i++){
            answer += my_stringArray[index_list[i]];
        }
        
        return answer;
    }
}