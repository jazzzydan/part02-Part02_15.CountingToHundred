
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        // for (*introducing a variable*; *condition*; *increasing the counter*) {
        // Functionality to be executed
        // }

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
