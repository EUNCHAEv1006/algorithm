import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int[] alphabetPositions = new int[26];

        for (int i = 0; i < 26; i++) {
            alphabetPositions[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int index = currentChar - 'a';

            if (alphabetPositions[index] == -1) {
                alphabetPositions[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetPositions[i] + " ");
        }
    }
}


