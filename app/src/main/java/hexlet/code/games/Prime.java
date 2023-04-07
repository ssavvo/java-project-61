package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void start() {
        var data = generateQnA();
        Engine.run(RULES, data);
    }
    public static String[][] generateQnA() {
        String[][] res = new String[Engine.MAX_ROUNDS][2];
        Random r = new Random();
        for (String[] row: res) {
            int number = r.nextInt(100);
            String answer = isPrime(number) ? "yes" : "no";
            row[0] = Integer.toString(number);
            row[1] = answer;
        }
        return res;
    }
    public static boolean isPrime(int number) {
        for (var i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
