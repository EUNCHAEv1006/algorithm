import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        N(수열의 크기)
        plusPq(양수 우선순위 큐) minusPq(음수 우선순위 큐)
        zero(0의 개수) one(1의 개수)

        for(N만큼) {
            각 그룹에 분리 저장
        }

        while(양수 우선순위 1개 이하 남아있을때까지) {
            양수 우선순위 내림차순 정렬
            양수 우선 순위 2개 뽑고 곱한걸 결괏값에 저장
        }
         */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int zero = 0;
        int one = 0;

        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            if (input > 1) {
                plusPq.add(input);
            } else if (input < 0) {
                minusPq.add(input);
            } else if (input == 1) {
                one++;
            } else {
                zero++;
            }
        }

        int sum = 0;
        while (plusPq.size() > 1) {
            int data1 = plusPq.poll();
            int data2 = 0;
            if (!plusPq.isEmpty()) {
                data2 = plusPq.poll();
            }
            sum += (data1 * data2);
        }
        if (!plusPq.isEmpty()) {
            sum += plusPq.poll();
        }

        while (minusPq.size() > 1) {
            int data1 = minusPq.poll();
            int data2 = 0;
            if (!minusPq.isEmpty()) {
                data2 = minusPq.poll();
            }
            sum += (data1 * data2);
        }
        if (!minusPq.isEmpty()) {
            if (zero > 0) {
                minusPq.poll();
            } else {
                sum += minusPq.poll();
            }
        }

        if (one > 0) {
            for (int i = 0; i < one; i++) {
                sum++;
            }

        }

        System.out.println(sum);
    }
}