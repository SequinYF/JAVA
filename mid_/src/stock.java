/**
 * Created by wyf on 20/12/16.
 */
import java.util.Scanner;
/* 你提交的代码将被嵌入到这里 */

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String a_s, String b_n){
        symbol = a_s;
        name = b_n;
    };

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice);
    }

}
public class stock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();

        // Input current price
        stock.currentPrice = input.nextDouble();

        // Display stock info
        System.out.println(stock.name+"price changed: " + stock.getChangePercent() * 100 + "%");
        input.close();
    }
}
