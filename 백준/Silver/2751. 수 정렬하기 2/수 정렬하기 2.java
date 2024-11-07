import java.io.*;

public class Main {
    public static int[] A, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        /*
            N(정렬할 수 개수)
            A(정렬할 배열 선언하기)
            tmp(정렬할 때 잠시 사용할임시 배열 선언하기)

            for(N의 개수만큼) {
                A 배열에 데이터 저장하기
            }

            병합 정렬 함수 수행
            결괏값 출력

            // 병합 정렬 수행
            병합 정렬(start_index, end_index) {
                start_index(시작점)
                end_index(종료점)
                middle_index(중간점)
                // 재귀 함수 형태로 구현하기
                병합 정렬(start_index, middle_index)
                병합 정렬(m+1, e)

                for(start_index ~ end_index) {
                    tmp 배열 정렬하기
                }

                // 두 그룹을 병합하는 로직
                index1 -> 앞쪽 그룹 시작점
                index2 -> 뒤쪽 그룹 시작점

                while(index1 <- 중간점 && index <- 종료점)
                    양쪽 그룹의 index가 가리키는 값을 비교한 후 더 작은 수를 선택해 배열에 저장하고,
                    선택된 데이터의 index 값을 오른쪽으로 한 칸 이동하기
                    반복문의 끝난 후 남아 있는 데이터 정리하기
            }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(1, N);

        for (int i = 1; i <= N; i++) {
            bw.write(A[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start_index, int end_index) {
        if (end_index - start_index < 1) {
            return;
        }

        int middle_index = start_index + (end_index - start_index) / 2;

        mergeSort(start_index, middle_index);
        mergeSort(middle_index + 1, end_index);

        for (int i = start_index; i <= end_index; i++) {
            tmp[i] = A[i];
        }

        int k = start_index;
        int index1 = start_index;
        int index2 = middle_index + 1;

        // 두 그룹 병합
        while (index1 <= middle_index && index2 <= end_index) {
            if (tmp[index1] > tmp[index2]) {
                A[k] = tmp[index2];
                k++;
                index2++;
            } else {
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        // 한쪽 그룹이 모두 선택된 후 남아 있는 값 정리하기
        while (index1 <= middle_index) {
            A[k] = tmp[index1];
            k++;
            index1++;
        }

        while (index2 <= end_index) {
            A[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}