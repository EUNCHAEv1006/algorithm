package lv1.숫자_비교하기;

public class Solution {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {

        if(num1 != num2){
            return -1;
        } else {
            return 1;
        }
    }
}