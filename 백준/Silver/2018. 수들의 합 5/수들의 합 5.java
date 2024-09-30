import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    N 입력
    sum 선언
    count(가지수) 선언
    end_index 선언
    start_index 선언

    for(N 만큼) {
        sum에 i 더하기
        만약, sum이 N이라면) count++ 하고 continue
        만약, sum이 >N 이라면) continue
    }

    count 출력
     */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 1;
        int count = 1;
        int end_index = 1;
        int start_index = 1;

        while (end_index != N) {
            if(sum==N) {
                count++;
                end_index++;
                sum += end_index;
            } else if(sum < N) {
                end_index++;
                sum += end_index;
            } else if(sum > N) {
                sum -= start_index;
                start_index++;
            }
        }

        System.out.println(count);
    }
}
