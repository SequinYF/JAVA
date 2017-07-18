import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wyf on 18/11/16.
 **/

public class bignumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf(String.valueOf(fun(num)));
    }

    public static BigInteger fun(long n){
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            ret = ret.multiply(new BigInteger(i + ""));
        }
        return ret;
    }

}