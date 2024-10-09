import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
            N(수열 개수) A[](수열 배열)
            수열 배열 채우기
            for(N만큼 반복) {
                if(현재 수열 값 >= 오름차순 자연수) {
                    while(현재 수열값 == 오름차순 자연수 까지) {
                        push()
                        (+) 저장
                    }
                    pop()
                    (-) 저장
                    }
                    else(현재 수열값 < 오름차순 자연수) {
                        pop()
                        if(스택 pop 결괏값 > 수열의 수) NO 출력
                        else(-) 저장
                    }
                }
                if(-값을 출력한 적이 없으면) 저장한 값 출력
            }
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1; // 오름차순 자연수
        boolean result = true;
        StringBuffer stringBuffer = new StringBuffer();
        for(int i =0; i<N; i++) {
            int su = A[i]; // 수열에 있는 값 가져오기
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int n = stack.pop(); // data를 빼온다
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                }
            }
        }
        if (result) System.out.println(stringBuffer.toString());
    }
}