package baekjoon.silver.four.카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            N(카드의 개수) myQueue(카드 저장 자료구조)
            for(카드의 개수만큼 반복) {
                큐에 자료 저장
            }
            while(카드가 1장 남을 때 까지) {
                poll : 제일 위에 한 장 버림
                poll -> add : 제일 위에 카드를 가장 아래로 이동
            }
            남은 카드 출력
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            myQueue.add(i);
        }
        while (myQueue.size()>1) {
            myQueue.poll();
            int temp = myQueue.poll();
            myQueue.add(temp);
        }

        System.out.println(myQueue.poll());
    }
}
