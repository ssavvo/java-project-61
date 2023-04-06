package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void start(Scanner scanner) {
        var count = 0;
        var name = Cli.greeting(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            var number = new Random().nextInt();
            System.out.println("Question: " + number);
            var answer = number % 2 == 0 ? "yes" : "no";
            System.out.print("Your answer: ");
            var input = scanner.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
        } while (count < 3);
        System.out.println("Congratulations, " + name + "!");
    }
}
