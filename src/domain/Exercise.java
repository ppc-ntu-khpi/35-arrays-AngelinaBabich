package domain;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Exercise {

    public static String Calculate(int N) {
        int[] numbers = new int[100];
        for (int i = 0; i <= N; i++) {
            if (checkSimple(i)) {
                numbers[i] = i;
            } else {
                numbers[i] = 0;
            }
        }
        String validNumbers = "1";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                validNumbers += (i > 0 ? ";" : "") + numbers[i];
            }
        }
        
        String sorted[] = validNumbers.split(";");
        
        return Arrays.toString(sorted);
    }

    public static boolean checkSimple(int i) {
        if (i <= 1) {
            return false;
        } else if (i <= 3) {
            return true;
        } else if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0) {
                return false;
            }
            n = n + 6;
        }
        return true;
    }
}
