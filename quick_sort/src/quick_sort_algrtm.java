import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Массив должен разделяться до тех пор, поеа мы не придем к базовому случаю.
 * Алгоритм быстрой сортировки работает так:
 * 1. сначала в массиве находится опорный элемент (33)
 * 2. находим элементы большеи меньше опорного: числа меньше 33 и числа больше 33 - этот процесс называется разделение
 * Теперь есть:
 * 1. подмассив всех элементов, меньше опорного
 * 2. опорный элемент
 * 3. подмассив вскх элементов больше опорного
 *
 * массив 33,15,10
 * 10,15 [33] ...
 *
 * -левыйподмассив - опорный элемент - правый подмассив
 *
 * каждое индуктивное доказательство состоит из двуз частей:
 * 1. базы (базового случая)
 * 2. индукционного перехода.
 */


public class quick_sort_algrtm {

 public static List<Integer> quicksort(List<Integer> input){

        if(input.size() <= 1){
            return input;
        }

        int middle = (int) Math.ceil((double)input.size() / 2);
        int pivot = input.get(middle);

        List<Integer> less = new ArrayList<Integer>();
        List<Integer> greater = new ArrayList<Integer>();

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i) <= pivot){
                if(i == middle){
                    continue;
                }
                less.add(input.get(i));
            }
            else{
                greater.add(input.get(i));
            }
        }

        return concatenate(quicksort(less), pivot, quicksort(greater));
    }

    /**
     * Join the less array, pivot integer, and greater array
     * to single array.
     * @param less integer ArrayList with values less than pivot.
     * @param pivot the pivot integer.
     * @param greater integer ArrayList with values greater than pivot.
     * @return the integer ArrayList after join.
     */
public  static List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater){

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }
}