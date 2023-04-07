package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static final String RULES = "Find the greatest common divisor of given numbers.";
    public static final int RANGE = 100;
    public static void start() {
        var data = generateQnA();
        Engine.run(RULES, data);
    }
    public static String[][] generateQnA() {
        String[][] res = new String[Engine.MAX_ROUNDS][2];
        Random r = new Random();
        for (String[] row: res) {
            int a = 1 + r.nextInt(RANGE);
            int b = 1 + r.nextInt(RANGE);
            var min = a - b > 0 ? b : a;
            var max = a - b > 0 ? a : b;
            while (max % min != 0) {
                var temp = max % min;
                max = min;
                min = temp;
            }
            row[0] = a + " " + b;
            row[1] = Integer.toString(min);
        }
        return res;
    }
}
