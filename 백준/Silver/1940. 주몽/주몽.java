import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 재료의 개수
        int M = scanner.nextInt(); // 갑옷을 만드는 데 필요한 수
        int[] S = new int[N]; // 재료의 고유 번호 배열

        // 재료 입력 받기
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }

        // 배열을 오름차순으로 정렬 -> 합을 비교하기 위해서 정렬. 뒤죽박죽이면 힘들잖아.
        Arrays.sort(S);

        int start = 0; // 시작 포인터
        int end = N - 1; // 끝 포인터
        int count = 0; // 갑옷의 개수

        // 두 포인터가 교차할 때까지 반복
        while (start < end) {
            int sum = S[start] + S[end];

            // 두 재료의 합이 M과 같으면 갑옷을 만들 수 있음
            if (sum == M) {
                count++;
                start++;
                end--;
            }
            // 두 재료의 합이 M보다 작으면 start 포인터를 오른쪽으로 이동
            else if (sum < M) {
                start++;
            }
            // 두 재료의 합이 M보다 크면 end 포인터를 왼쪽으로 이동
            else {
                end--;
            }
        }

        // 갑옷의 개수 출력
        System.out.println(count);
    }
}
