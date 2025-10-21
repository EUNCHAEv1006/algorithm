class Solution {
    public int solution(int a, int b) {
        
        int add = Integer.parseInt(a + "" + b);
        int multi =  2*a*b;
        
        return Math.max(add, multi);
    }
}