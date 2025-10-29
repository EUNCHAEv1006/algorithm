class Solution {
    public int solution(String number) {
        int answer = 0;
        
        char[] numberArray = number.toCharArray();
        
        for(int i=0; i<numberArray.length; i++){
            answer += numberArray[i] - '0';
        }
        
        return answer%9;
    }
}