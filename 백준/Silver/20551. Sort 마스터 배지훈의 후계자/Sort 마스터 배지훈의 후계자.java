import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    // N : 원소의 개수
    // M : 질문의 개수
    static int N, M;

    static List<Integer> numberList;

    static int binarySearch(int targetNumber) {

        // low, high 둘 다 범위 안에 들어오게끔 설정
        int low = 0;
        int high = numberList.size() - 1;

        // 등호
        while (low <= high) {
            int mid = (low + high) / 2;

            if (numberList.get(mid) == targetNumber) {
                if (high == mid) {
                    return mid;
                }
                high = mid;
                continue;
            }

            // 더 작은 경우
            if (numberList.get(mid) < targetNumber) {
                low = mid + 1;
                continue;
            }

            // 더 큰 경우
            high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numberList = new ArrayList<>();

        // 데이터 삽입
        for (int i = 0; i < N; i++) {
            numberList.add(Integer.parseInt(br.readLine()));
        }

        // 정렬
        Collections.sort(numberList);

        // 질문
        for (int i = 0; i < M; i++) {
            int targetNumber = Integer.parseInt(br.readLine());
            int result = binarySearch(targetNumber);
            System.out.println(result);
        }

        br.close();
    }
}