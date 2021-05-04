import java.util.ArrayList;
import java.util.Arrays;

/**
 * Быстрая сортировка - разделяй и властвуй
 *
 * Решение методом разделяй и властвуй состоит из 2х шагов:
 * 1. Сначала определяется базовый случай. Это должен быть простейший случай из всех возможных
 * 2. Задача делится и сокращается до тех пор, пока не будет сведена к базовому случаю.
 *
 * прямоугольник длина 1680
 * ширина 640
 *
 * максимальных одинаковых квадратов 80х80
 *
 */

public class Quick_sort {


    public static int summ(int [] x)
    {
        int together=0;
        for( int num : x){

            together = together + num;
        }
        return together;
    }

    public static void main(String[] args) {
        int[] marks = { 8,3,5,4,3,2,1};

        System.out.println(summ(marks)+ " сумма");
        System.out.println("\r");
        System.out.println(Recursion_sort.sum2(marks) + " рекурсивная сумма");
        System.out.println("\r");
        System.out.println(Recursion_count.sum3(marks) + " сумма + рекурсия");
        System.out.println("\r");
        System.out.println(Recursion_max.max2(marks) + " максимальное число + рекурсия");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(990);
        list.add(992);
        list.add(995);
        list.add(993);
        list.add(991);


        System.out.println("\r");
        for (int number : quick_sort_algrtm.quicksort(list)) {
            System.out.println(number + " быстрая сортировка слиянием");
        }

        System.out.println("\r");

        for (int number : QuickSortAlg.quicksort2(list)) {
            System.out.println(number + " быстрая сортировка");
        }

        System.out.println("\r");
        System.out.println(Arrays.deepToString(multiply.multiply(marks)));


    }

}
