
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/**
 * Created by wyf on 18/11/16.
 */
public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int j = 0;
        while (count < 3) {
            int time = 0;
            for (j = 2; j <= sqrt(n); j++) {
                if (n % j == 0) {
                    time++;
                    break;
                }
            }
            if (time == 0) {
                count++;
                System.out.println(n);
            }
            n++;
        }
    }
}

