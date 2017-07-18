import java.util.Scanner;

/**
 * Created by wyf on 18/11/16.
 */
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String temp;
        while(input.hasNextLine()){
            temp = input.nextLine();
            if(temp.equals("end")){
                break;
            }

            str = str + temp;
        }

        String s1 = input.nextLine();
        String s2 = input.nextLine();

        String ss = str.replace(s1, s2);
        System.out.print(ss);
    }
}
