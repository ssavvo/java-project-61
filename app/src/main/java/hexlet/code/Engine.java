package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static void run(String rules, String[][] data) {
        Scanner scan = new Scanner(System.in);
        int round = 0;

        var name = Cli.greeting(scan);
        System.out.println(rules);

        do {
            System.out.println("Question: " + data[round][0]);
            System.out.print("Your answer: ");
            var input = scan.next();
            if (!input.equals(data[round][1])) {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + data[round][1] + "'.\n"
                        + "Let's try again, " + name + "!");
                scan.close();
                return;
            }
            System.out.println("Correct!");
            round++;
        } while (round < MAX_ROUNDS);
        System.out.println("Congratulations, " + name + "!");
        scan.close();
    }
}
