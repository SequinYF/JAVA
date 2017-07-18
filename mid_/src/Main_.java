/**
 * Created by wyf on 20/12/16.
 */
import java.lang.*;

interface ClassName{
    String getClassName();
}

public class Main_ implements ClassName{
    public String getClassName(){
        return getClass().getName();
    }

    public static void main(String[] args) {
        Main_ com = new Main_();
        System.out.println(com.getClassName());
    }

}
