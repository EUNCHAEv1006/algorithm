package baekjoon.silver.five.수들의_합5;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            N 변수 저장
            사용 변수 초기화(Count, Start_index, end_index, sum = 1)
            while(end_index != N) {
                if(sum==N) {
                    count 증가, end_index 증가, sum 변경
                } else if (sum>N) {
                    sum 변경, start_index 증가
                } else if (sum<N) {
                    end_index 증가, sum 변경
                }
            }
            count 출력
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum<N) {
                end_index++;
                sum=sum+end_index;
            } else if (sum>N) {
                sum=sum-start_index;
                start_index++;
            } else if (sum==N) {
                end_index++;
                sum=sum+end_index;
                count++;
            }
        }
        System.out.println(count);
    }
}
