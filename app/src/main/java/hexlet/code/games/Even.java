package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void start() {
        var data = generateQnA();
        Engine.run(RULES, data);
    }
    public static String[][] generateQnA() {
        String[][] res = new String[Engine.MAX_ROUNDS][2];
        Random r = new Random();
        for (String[] row: res) {
            int number = r.nextInt(100);
            String answer = number % 2 == 0 ? "yes" : "no";
            row[0] = Integer.toString(number);
            row[1] = answer;
        }
        return res;
    }
}
