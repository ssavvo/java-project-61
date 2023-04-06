package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        var input = scanner.nextInt();
        System.out.println("Your choice: " + input + "\n");
        if (input < 1 || input > 9) {
            return;
        }
        switch (input) {
            case 1:
                Cli.greeting(scanner);
                break;
            case 2:
                Even.start(scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }
}
