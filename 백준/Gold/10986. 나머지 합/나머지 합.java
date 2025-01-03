import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] S = new long[N]; // 합배열
        long[] C = new long[M]; // 합배열%M을 동일하게 만들어주는 i,j를 담는 배열
        
        long answer = 0;
        
        S[0] = scanner.nextInt();
        
        for(int i=1; i<N; i++) {
            S[i] = S[i-1] + scanner.nextInt();
        }
        
        for(int i=0; i<N; i++){
            int remainder = (int) (S[i]%M);
            
            if(remainder == 0) {
                answer++;
            }
            
            C[remainder]++;
        }
        
        for(int i=0; i<M; i++) {
            if(C[i]>1) {
                long count = C[i];

                // 나머지가 같은 두 누적합을 선택하면, 그 사이의 구간 합이 M으로 나눠떨어짐
                // 두 개를 선택할 때마다 각기 다른 구간을 만들 수 있음
                // mC2
                answer += count * (count-1) / 2;
            }
        }

        System.out.println(answer);
    }
}
