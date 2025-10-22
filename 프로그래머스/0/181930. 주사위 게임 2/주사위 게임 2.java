class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int pow2 = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int pow3 = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if((a!=b)&&(b!=c)&&(a!=c)) {
            answer += (a+b+c);
        } else if((a==b)&&(b==c)&&(a==c)) {
            answer += ((a+b+c)*pow2*pow3);
        } else {
            answer += ((a+b+c)*pow2);
        }
        
        return answer;
    }
}