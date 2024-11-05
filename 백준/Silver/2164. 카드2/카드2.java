import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        N 입력(카드의 개수)
        queue 선언

        큐: FIFO
        1. 첫 번째를 poll
        2. 두 번째를 제일 뒤로
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while(queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}