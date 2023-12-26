package lv2.자릿수_더하기;

public class Solution {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer=answer+n%10;
            n=n/10;
        }
        return answer;
    }
}