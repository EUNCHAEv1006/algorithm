package programmers.lv1.짝수의_합;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i=0; i <= n; i++){
            if(i%2==0){
                answer=i+answer;
            }
        } return answer;
    }
}