package lv2.짝수와_홀수;

public class Solution {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
    }

    public static String solution(int num) {
        String oanswer = "Odd";
        String eanswer = "Even";

        if(num%2==0){
            return eanswer;
        } else {
            return oanswer;
        }
    }
}