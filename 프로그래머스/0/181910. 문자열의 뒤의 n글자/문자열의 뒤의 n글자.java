class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] my_stringArray = my_string.toCharArray();
        
        for(int i=my_stringArray.length-n; i<my_stringArray.length; i++){
            answer += my_stringArray[i];
        }
        
        return answer;
    }
}