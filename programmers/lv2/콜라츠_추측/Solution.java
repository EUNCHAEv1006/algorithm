package programmers.lv2.콜라츠_추측;

public class Solution {
    public static void main(String[] args) {
//        int num = 6;
//        int num = 16;
        int num = 626331;
        System.out.println(solution(num));
    }

//    public static int solution(int num) { <- num=62631일 때, 오버플로우 발생하기 때문에 Long num으로 변경함
    public static int solution(long num) {
        int count = 0;


        while (num != 1) {
            if (num%2 == 0) {
                num /= 2;
            } else {
                num = (num*3) + 1;
            }
            count++;

            if (count > 500 && num != 1) {
                return -1;
            }
        }


        return count;
    }
}