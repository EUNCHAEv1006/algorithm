import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        N(레슨 개수) M(블루레이 개수)
        A(기타 레슨 데이터 저장 배열)
        start(이진 탐색 시작 인덱스)
        end(이진 탐색 종료 인덱스)
        
        for(N의 개수만큼 반복하기) {
            A 배열 저장하기
            시작 인덱스 저장(A 배열 중 최댓값)
            종료 인덱스 저장(A 배열의 총합)
        }
        
        while(시작 인덱스 <= 종료 인덱스) {
            middle(중간 인덱스)
            sum(레슨 합)
            count(현재 사용한 블루레이 개수)
            
            for(N의 개수만큼 반복하기) {
                만약 sum + 현재 레슨 시간 > 중간 인덱스이면 count값을 올리고 sum을 0으로 리셋하기
                sum에 현재 레슨 시간 더하기
            }
            
            sum이 0이 아니면 마지막 블루레이가 필요하므로 count값 올리기
            if(count > M: 중간 인덱스값으로 모든 레슨 저장 불가능) 시작 인덱스 = 중앙 인덱스 + 1
            else(중간 인덱스값으로 모든 레슨 저장 가능) 종료 인덱스 = 중앙 인덱스 - 1
        }
        
        시작 인덱스 출력하기
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int start = 0;
        int end = N - 1;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            if (A[i] > start) {
                start = A[i];
            }
            end += A[i];
        }

        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (sum + A[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }

            if (sum != 0) {
                count++;
            }
            if (count > M) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start);
    }
}