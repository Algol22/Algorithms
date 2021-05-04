import java.util.ArrayList;
import java.util.List;

/**
 * 1. Бинарный поиск - O(log n)
 * 2. Простой поиск - O(n)
 * 3. Быстраясортировка - O(n log n)
 * 4.Сортировка выбором - O(n^2)
 * 5. Задача о коммивояжере - O(n!)
 *
 * В худшем случае быстрая сортировка работает за O(n^2)
 * В среднем быстрая сортировка работает за 0(n log n)
 *
 * c * n
 * c - фиксированный промежуток времени (константа)
 * Обычно константа игнорируется, потому,что если дваалгоритма имеют разное "О большое" - она роли не играет
 *
 * Простой поиск: 1c * n
 * Бинарный поиск: 10мс * n
 *
 * 10 мс * 4 миллиарда = 463 дня
 * 1с * 32 = 32 секунды
 * Бинарный поиск все равно работает быстрее, константани на что не влияет.
 *
 * У бычтрой сортировки константа меньше, чем у сортировки слиянием, поэтому, несмотря на что у обоих алгоритмов
 * 0 (n log n) - быстрая сортировка работает быстрее.
 *
 * Быстрая сортирровка  - опорный элемент 1ый
 * [1] 2 3 4 5 6 7 8----1
 * [2] 3 4 5 6 7 8------2
 * [3] 4 5 6 7 8--------3
 * [4] 5 6 7 8----------4
 * [5] 6 7 8------------5
 * [6] 7 8--------------6
 * [7] 8----------------7
 * [8]------------------8
 * общая высота стека вызовов - 8 - только один подмассив, стэк вызовов получается очень доинным
 * O(n) - 8 элементов - 8 шагов
 *
 * Опорный выберем средний элемент, стек вызовов:
 * 1 2 3 4 5 6 7 8 ---------1
 * 1 2 3 [4] 5 6 7 8--------2
 * 1[2]3     5[6]78---------3
 *               [7]8-------4
 *
 * O(log n) - log 2 8 =
 * Размер стека вызовов-4
 * - стек короче
 * - массивкаждый раз делится на двое
 * - меньшее количество рекурсивных вызовов
 * - быстрее добирается до базового случая (один элемент, или 0 элементов)
 *
 *
 * КАЖДЫЙ УРОВЕНЬ СТЕКА - O(n) - обращаемся ко всем элементамна  каждом уровне стека вызовов!
 * даже если 2 подмассива - 0(n) - обращение к элементам.
 * Итак, завершение каждого уровня требуетвремени O(n)
 *
 * Правильно скзать - высота стека вызовов равна  O(log n) уровней.
 * Поскольку каждый уровень - O(n) - то весь алгоритм займет времени O(n) * O(log n) = O(n * log n) - сценраий лучшего случая
 * В худшем случае существует O (n) уровней - алгоритм займет время O(n) * O(n)  = O(n^2)
 *
 */


public class QuickSortAlg extends quick_sort_algrtm {
    public static List<Integer> quicksort2(List<Integer> input){

        if(input.size() <= 1){
            return input;
        }

        int middle = (int) Math.ceil((double)input.size() / 2);
        int pivot = input.get(0);

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

        return concatenate(quicksort2(less), pivot, quicksort2(greater));
    }

    /**
     * Join the less array, pivot integer, and greater array
     * to single array.
     * @param less integer ArrayList with values less than pivot.
     * @param pivot the pivot integer.
     * @param greater integer ArrayList with values greater than pivot.
     * @return the integer ArrayList after join.
     */

}
