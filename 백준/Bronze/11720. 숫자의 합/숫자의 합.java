import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        N 입력 받기
        String 형으로 저장 sNum
        Char으로 변경 cNum (tochararray)
        int형 sum 선언
        for(1~cNum){
            sum에 더하기
        }
        sum 출력
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String sNum = scanner.next();
        char[] cNum = sNum.toCharArray();
        int sum=0;

        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - 48;
        }

        System.out.println(sum);
    }
}
