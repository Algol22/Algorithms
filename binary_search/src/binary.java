import com.sun.tools.javac.Main;
/*
В общем случае дл списка из n элементов бинарный поиск
выполняется за log2(n) шагов, тогда как простой поиск будет
выполняться за n шагов.

*/

public class binary {
    // write your code here
//

    //7
    //3



public static void finder(int []b, int x){
    int low = b[0];
    int top = b.length - 1;
    long log = Math.round(Math.log(16)/Math.log(2));




     for (int foo=1; foo<=log+1; foo++) {
        int center = ((low + top)) / 2;
        System.out.println("low: "+low + " top: " + top + " middle: " + center+":" + "item: " +b[center]+" лог. с основ 2: "+log);
        if (x!=b[center]) {

            if (x < b[center]) {
                top = center;
                center = (center + top) / 2;
            } else {
                low = center;
                center = (center + low) / 2;
            }

        }else{
            break;
        }


    }
}





    public static void main(String[] args) {
        // write your code here
        int[] b = {0,1,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,32,33,35,38};
        binary.finder(b,3);
    }
}