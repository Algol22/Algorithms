import java.util.Arrays;

public class Recursion_max {


    public static int max2 (int [] x){

        if (x.length == 2){
          if(x[0]>x[1]){
              return x[0];
          }else{
              return x[1];
          }
        }else{
           int maxxx = max2 (Arrays.copyOfRange(x, 1, x.length));
           if(x[0]> maxxx) {
               return x[0];
           }else{
               return maxxx;
           }
        }//1 - базовый случай
    }
}
