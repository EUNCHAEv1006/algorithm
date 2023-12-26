package lv1.각도기;

public class Solution {
    public static void main(String[] args) {
        int angle = 40;
        System.out.println(solution(angle));
    }

    public static int solution(int angle) {

        if(angle < 90 && angle > 0){
            return 1;
        } else if(angle == 90) {
            return 2;
        } else if(angle < 180 && angle >90) {
            return 3;
        } else {
            return 4;
        }
    }
}