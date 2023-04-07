package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static final String RULES = "What is the result of the expression?";
    public static void start() {
        var data = generateQnA();
        Engine.run(RULES, data);
    }
    public static String[][] generateQnA() {
        String[][] res = new String[Engine.MAX_ROUNDS][2];
        Random r = new Random();
        for (String[] row: res) {
            int a = r.nextInt(100);
            int b = r.nextInt(100);
            switch (r.nextInt(3)) {
                case 0:
                    row[0] = a + " + " + b;
                    row[1] = Integer.toString(a + b);
                    break;
                case 1:
                    row[0] = a + " - " + b;
                    row[1] = Integer.toString(a - b);
                    break;
                case 2:
                    row[0] = a + " * " + b;
                    row[1] = Integer.toString(a * b);
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}
