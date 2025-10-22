class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int add = a;
        
        if(included[0]) {
            answer += a;
        }
        
        for(int i=1; i<included.length; i++){
            add += d;
            if(included[i]) {
                answer += add;
            }
        }
        
        return answer;
    }
}