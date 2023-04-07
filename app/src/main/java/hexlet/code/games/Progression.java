package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static void start() {
        var data = generateQnA();
        Engine.run(RULES, data);
    }
    public static String[][] generateQnA() {
        String[][] res = new String[Engine.MAX_ROUNDS][2];
        Random r = new Random();
        for (String[] row: res) {
            int start = r.nextInt(5);
            int step = r.nextInt(10);
            String[] arr = new String[10];
            for (var i = 0; i < arr.length; i++) {
                arr[i] = Integer.toString(start + step * i);
            }
            int extractElem = r.nextInt(10);
            row[1] = arr[extractElem];
            arr[extractElem] = "..";
            row[0] = String.join(" ", arr);
        }
        return res;
    }
}
