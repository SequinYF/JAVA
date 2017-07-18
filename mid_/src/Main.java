import java.awt.Point;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double m = input.nextDouble();
        double n = input.nextDouble();


        double jili = Math.sqrt((x-m)*(x-m) + (y-n)*(y-n));

        System.out.printf("%.2f", jili);
    }


}