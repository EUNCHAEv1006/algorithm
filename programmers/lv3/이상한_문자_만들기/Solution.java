package programmers.lv3.이상한_문자_만들기;

public class Solution {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        int cnt = 0;
        String[] strArr = s.split("");

        for (String string : strArr) {
            if (string.contains(" ")) {
                cnt = 0;
            } else
                cnt++;

            if (cnt % 2 == 0) {
                answer += string.toLowerCase();
            } else {
                answer += string.toUpperCase();
            }
        }

        return answer;
    }
}
