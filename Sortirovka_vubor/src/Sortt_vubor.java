import java.util.Arrays;

/**
 * сортировка выбором (Selection sort).
 * Идея алгоритма: ищем минимальный элемент в массиве и меняем его местами с элементом,
 * находящимся в позиции ноль.
 * Далее ищем следующий по величине элемент и меняем его с элементом с индексом 1 и так далее:
 */
import javax.swing.JOptionPane;


public class Sortt_vubor {


    public static int [] Sort( int[] b){
       //biggest element

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                int tmp = 0;
                if (b[i] > b[j]) {
                    tmp = b[i];
                    b[i] = b[j];
                    b[j]= tmp;


                }

            }
        }
            return b;

    }


    public static void main(String[] args)
    {
        int[] arr = {13, 7, 6, 45, 21, 9, 2, 99, 9, 101, 102};
        Sortt_vubor one = new Sortt_vubor();
        System.out.println(Arrays.toString(one.Sort(arr)));


        // Our arr contains 8 elements
//
//
//        Arrays.sort(arr);
//
//        System.out.printf(Arrays.toString(arr));
    }
}
