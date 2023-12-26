package lv2.약수의_합;

public class Solution {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){

            if(n%i==0){
                answer=answer+i;
            }
        }
        return answer;
    }
}