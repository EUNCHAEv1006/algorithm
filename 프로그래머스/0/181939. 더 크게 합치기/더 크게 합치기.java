class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        //integer.parseint -> str -> int
        //integer.tostring -> int -> str
        
        String sab = Integer.toString(b) + Integer.toString(a);
        String sba = Integer.toString(a) + Integer.toString(b);
        
        if (Integer.parseInt(sab) > Integer.parseInt(sba)){
            answer = Integer.parseInt(sab);
        } else {
            answer = Integer.parseInt(sba);
        }
        
        return answer;
    }
}