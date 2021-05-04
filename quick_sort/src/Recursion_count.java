import java.util.Arrays;

public class Recursion_count {

    public static int sum3 (int [] x){

        if (x.length == 0){
            return 0;
        }else{
            return 1+ (x.length-1) ;
        }//1 - базовый случай
    }
}
