import java.util.Scanner;

public class Main {
    public static String S;

    public static void main(String[] args) {
        /*
         * 0에서 1로 변한다는 건 0으로 뒤집어야 하니 +1 : 전체를 0으로 만들기 위한 작업
         * 1에서 0으로 변한다는 건 1로 뒤집어야 하니 +1 : 전체를 1로 만들기 위한 작업
         *
         * 1) 뒤집어 질 경우
         * 2) 첫 번째 원소가 0인지 1인지
         * 에 대해서 계산하면, 모두 0으로 만드는 횟수와 모두 1로 만드는 횟수를 만들 수 있음
         *
         * 위 둘 중 비교해서 최솟값을 반환
         * */
        Scanner scanner = new Scanner(System.in);

        S = scanner.next();
        System.out.println(getMinFlip());
    }

    private static int getMinFlip() {
        int count0 = 0;
        int count1 = 0;

        char prev = S.charAt(0);
        if (prev == '0') count0++;
        else count1++;

        for (int i = 0; i < S.length(); i++) {
            char curr = S.charAt(i);
            if (curr != prev) {
                if (curr == '0') {
                    count0++;
                } else count1++;
            }
            prev = curr;
        }

        return Math.min(count0, count1);
    }
}


