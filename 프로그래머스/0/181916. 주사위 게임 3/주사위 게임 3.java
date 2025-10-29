class Solution {
    public int solution(int a, int b, int c, int d) {
        // 1. 모두 같은지 확인
        if (a == b && b == c && c == d) {
            return 1111 * a;
        }
        
        // 2. 3개가 같은지 확인
        if (a == b && b == c && c != d) return (10 * a + d) * (10 * a + d);
        if (a == b && b == d && c != d) return (10 * a + c) * (10 * a + c);
        if (a == c && c == d && b != d) return (10 * a + b) * (10 * a + b);
        if (b == c && c == d && a != d) return (10 * b + a) * (10 * b + a);
        
        // 3. 2개씩 같은지 확인
        if (a == b && c == d) return (a + c) * Math.abs(a - c);
        if (a == c && b == d) return (a + b) * Math.abs(a - b);
        if (a == d && b == c) return (a + b) * Math.abs(a - b);
        
        // 4. 2개만 같은지 확인
        if (a == b) return c * d;
        if (a == c) return b * d;
        if (a == d) return b * c;
        if (b == c) return a * d;
        if (b == d) return a * c;
        if (c == d) return a * b;
        
        // 5. 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}