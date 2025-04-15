import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String gameType = scanner.next();

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(scanner.next());
        }

        int required;

        if (gameType.equals("Y")) {
            required = hashSet.size();
        } else if (gameType.equals("F")) {
            required = hashSet.size() / 2;
        } else {
            required = hashSet.size() / 3;
        }

        System.out.println(required);
    }
}