package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greeting(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
