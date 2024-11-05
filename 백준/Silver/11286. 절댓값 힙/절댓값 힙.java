import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        /*

       N(질의 요청 개수)
       우선순위 큐 선언
       - 절댓값 기준으로 정렬되도록 설정하기
       - 단, 절댓값이 같으면 음수 우선 정렬하기

       for(N만큼 반복) {
            요청이 0일 때: 큐가 비어 있으면 0, 비어 있지 않으면 큐의 front값 출력하기(poll())
            요청이 1일 때: 새로운 데이터를 우선순위 큐에 더하기(add())
       }
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs)
                return o1 > o2 ? 1 : -1;
            else
                return first_abs - second_abs;
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());

            if (request == 0) {
                if (queue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(queue.poll());
            } else {
                queue.add(request);
            }
        }
    }
}