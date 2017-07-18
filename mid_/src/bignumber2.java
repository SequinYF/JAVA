import java.math.BigInteger;
import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by wyf on 18/11/16.
 */
public class bignumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        String[] part = number.split("[+]|[-]|[*]|[/]");

        char op = number.substring(part[0].length()).charAt(0);
        System.out.println("op : " + op);

        BigInteger n1 = new BigInteger(part[0]);
        BigInteger n2 = new BigInteger(part[1]);

        switch(op){
            case '+':
                System.out.println("+: " + n1.add(n2));
                break;
            case '*':
                System.out.printf("*: " + n1.multiply(n2));
                break;
            case '/':
                System.out.println("/: " + n1.divide(n2));
                break;
            case '-':
                System.out.println("-: " + n1.subtract(n2));
        }
    }
}
