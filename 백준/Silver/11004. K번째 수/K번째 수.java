import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());  // 전체 숫자의 개수
        int K = Integer.parseInt(stringTokenizer.nextToken());  // 찾고자 하는 K번째 수의 위치

        // 최대 힙을 사용하여 가장 작은 K번째 수를 찾음
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            maxHeap.add(num);  // 힙에 현재 숫자 추가

            // 힙의 크기가 K를 초과하면 가장 큰 값을 제거하여 K개의 요소만 유지
            if (maxHeap.size() > K) {
                maxHeap.poll();
            }
        }

        // 힙의 루트 값이 K번째 작은 수가 됨
        System.out.println(maxHeap.peek());
    }
}
