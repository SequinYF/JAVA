import java.util.Scanner;

/**
 * Created by wyf on 18/11/16.
 */
public class string_ {
    public static void main(String[] args){
        final int N = 5;
        Scanner input = new Scanner(System.in);
        String[] str = new String [N];
        int []num = new int[N];

        for(int i = 0; i < N; i++){
            str[i] = input.nextLine();
        }
        for(int i = 0; i < N; i++){
            num[i] = input.nextInt();
        }
        int min = num[0];
        for(int i = 0; i < N; i++){
            if(min < num[i]){
                min = num[i];
            }
        }

        for(int i = 0; i < N; i++){
            int k = i;
            String temp = str[k];
            for(int j = i + 1; j < N; j++){
                if(str[j].compareTo(str[k]) < 0){
                    k = j;
                    temp = str[j];
                }
            }

            if(k != i){
                String o;
                o = str[i];
                str[i] = str[k];
                str[k] = o;
            }
        }



        System.out.println("Max string is " + str[N-1]);
        System.out.println("Max integer is " + min);

//
//        for(int i = 0; i < N; i++){
//            System.out.println(str[i]);
//        }
//
//        String replace_;
//        replace_ = "chilaohudetuzi";
//        System.out.println(replace_.replace("tuzi", "tutu"));

    }
}
