class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        if(n%2!=0){
            for(int i=1; i<=n; i++) {
                if(i%2!=0) answer += i;
                else continue;
            }
        } else {
            for(int j=2; j<=n; j++) {
                if(j%2==0) {
                    answer += Math.pow(j, 2);
                } else continue;
            }
        }
        
        
        return answer;
    }
}