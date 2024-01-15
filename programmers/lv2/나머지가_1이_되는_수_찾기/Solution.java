package programmers.lv2.나머지가_1이_되는_수_찾기;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int x=1; x<n; x++){
            if(n%x==1){
                answer=answer+x;
                break;
            }
        }

        return answer;
    }
}