import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
            N(수열 개수) A[](수열 배열) ans[](정답 배열)
            수열 배열 채우기
            최초 스택 초기화하기

            for(N만큼 반복) {
                while(스택이 비어 있지 않고, 현재 수열 값이 top에 해당하는 수열보다 클 때까지) {
                    pop()
                    정답 배열에 오큰수를 현재 수열로 저장하기
                }
                현재 수열을 스택에 push()
            }

            while(스택이 빌 때까지) {
                스택에 있는 인덱스의 정답 배열에 -1 저장하기
            }

            정답 배열 출력하기
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] ans = new int[N];

        // 정답 배열을 -1로 초기화
        Arrays.fill(ans, -1);

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bufferedWriter.write(ans[i] + " ");
        }
        bufferedWriter.write("\n");
        bufferedWriter.flush();
    }
}