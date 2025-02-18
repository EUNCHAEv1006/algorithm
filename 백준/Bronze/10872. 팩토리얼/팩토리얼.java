import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int answer = 1;

        while(n != 0) {
            answer *= n;
            n--;
        }

        System.out.println(answer);
    }
}


