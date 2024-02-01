package baekjoon.silver.one.절댓값_힙_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            N(질의 요청 갯수)
            myQueue(우선순위 큐)
            - 절댓값 기준으로 정렬
            - 단, 절댓값이 같으면 음수 정렬
            for(N의 길이만큼 반복) {
                요청이 0일 때: 큐가 비어 있으면 0 출력, 비어 있지 않으면 큐의 front 값 출력(poll())
                요청이 1일 때: 새로운 데이터를 우선순위 큐에 더하기(add())
            }
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절댓값이 같은 경우 음수 우선
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; // 1과 -1은 중요한 것이 아니고, 양수와 음수로 생각하면 된다.
            }

            return first_abs - second_abs; // 절댓값이 작은 데이터 우선
        });

        for (int i=0; i<N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if (request == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }

    }
}
