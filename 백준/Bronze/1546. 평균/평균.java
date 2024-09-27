import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        식을 간단하게 표현하면: (A+B+C)*100/3/M
        N(시험 본 과목의 개수) 입력받기
        for(A[]의 길이만큼) {
            N의 개수만큼 배열 A[] 입력받기
        }
        for(A[]의 길이만큼) {
            최고 점수를 max에 저장하기
            A[]의 합을 sum에 저장하기
        }
        (A+B+C)*100/3/M 출력
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A[] = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }


        long max = 0;
        long sum = 0;
        for(int i=0; i<A.length; i++){
            if (A[i] > max) max = A[i];
            sum += A[i];
        }
        System.out.println((sum*100.0)/N/max);
    }
}
