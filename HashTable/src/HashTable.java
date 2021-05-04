import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * хеш-таблица создается обьединением хеш-функции с массивом
 * коллизии нежелательны
 * хеш-тьаблицы обеспечивают очень быстрое выполнение поиск, вставки и удаления
 * хеш-таблицы хорошо подходят для моделирования отношений между обьектами
 * как только коэффициент заполнения превышает 0,7 - пора изменять размер хе0таблицы
 * хеш-таблицы используют для кэширования данных
 * ххеш-таблицы хорошо подходят дляобнаружения дуликатов
 *
 *
 * КОЛЛИЗИИ
 * АВОКАДО - АПЕЛЬСИН - ПЕРВАЯ ЯЧЕЙКА ХЕШ-ТАБЛИЦЫ
 * 1. Решение: в одном элементе создать связанный список.
 * - в идеале хеш функция должна распределять ключи равномерно по всему хешу
 * - хорошая хеш-функция создает минимальное число коллизий
 *
 * В среднем хеш-таблицы выполняют любые операции за время О(1) - постоянное время.
 * В худшем случае - операции в хеш таблице выполняются за O(n)
 * Хеш-таблицы - взяли лучше от массивов и от связанных списков.
 *
 * коэффициент заполнения
 * [][1][][0][]
 * 2/5 - коэффициент заполнения
 * Коэффициент заполенния больше 1 означает, что количество товаров превышает количество элементов в массиве.
 * с меньшим коэффициентом загрузки количество коллизий уменьшается - таблица работает более эффективно.
 * ПРАВИЛО: изменяйте размер хеш-таблицы, когда коэффициент заполнения превышает 0,7
 *
 *
 *
 * сервер выполняет работу только в том случае, если url не хранится в кеше,
 * когда снова запросит ту же страницу - данные передадутся из кеша
 *
 * если быимена хранились всписке, то выполнение функции современем замедлилось бы
 * потомучтофункции пришлось быпроводить простой поискпо всему списку.
 * Но имена хранятся в хеш-таблице, ахеш-таблица мгновенно сообщает, присутствует
 * имя избирателя в списке или нет.хч
 *
 * хеш-функция получает строку и возврящает ичсло
 * хеш-функция связывает разные строки с разными индексами
 * хеш-таблицы: ассоциативные массивы, словари, отображения, хеш-карты, хеши.
 *
 *
 * Хеш-таблица — это структура данных для хранения пар ключей и их значений.
 * По сути она представляет собой массив, где местоположение элемента зависит
 * от значения самого элемента. Связь между значением элемента и его позицией
 * в хеш-таблице задает хеш-функция. Важное свойство хеш-таблицы: поиск, вставка
 * и удаление элементов из таблицы выполняются за фиксированное время, то есть О(1),
 * то есть они нужны тогда, когда максимально важна скорость этих операций.
 *
 * Хеш-функция принимает ключ на вход и вычисляет индекс массива, исходя из внутренних свойств этого ключа.
 *
 * Сначала вам нужно использовать хеш-функцию, чтобы определить,
 * где в хеш-таблице хранится данный ключ. Затем нужно будет использовать
 * ту же самую хеш-функцию, чтобы определить, где в хеш-таблице искать данный ключ.
 *
 *
 * Двумя распространенными методами борьбы с коллизиями являются линейное зондирование и метод цепочек.
 *
 * Линейное зондирование заключается в поиске первой пустой ячейки после той, на которую указала хеш-функция.
 *
 * При методе цепочек, каждая ячейка хеш-таблицы — это список значений. При возникновении коллизии,
 * новое значение просто добавляется в список в ту же ячейку таблицы.
 */

public class HashTable {

    //массив для хранения элементов
    private Item[] table;
    //количество элементов в таблице
    private int count;
    //размер таблицы
    private int size;

    private int hash(String key)
    {
        int hash = 0;

        for(int i = 0; i < key.length(); i++)
            hash = (31 * hash + key.charAt(i)) % size;

        return hash;
    }

    public HashTable(int size) {
        this.size = size;
        table = new Item[size];
    }

    public void insert(String key)
    {
        Item item = new Item(key);
        int hash = hash(key);
        while(table[hash] != null)
        {
            hash++;
            hash %= size;
        }
        table[hash] = item;
    }

    public void print()
    {
        for(int i = 0; i < size; i++)
            if(table[i] != null)
                System.out.println(i + " " + table[i].getKey());
    }

    public Item find(String key)
    {
        int hash = hash(key);
        while(table[hash] != null)
        {
            if(table[hash].getKey().equals(key))
                return table[hash];
            hash++;
            hash = hash % size;
        }

        return null;
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable(97);

        hashTable.insert("rhino");
        hashTable.insert("man");
        hashTable.insert("computer");
        hashTable.insert("home");
        hashTable.insert("basket");

        hashTable.print();

        Item item = hashTable.find("man");

        if(item != null)
            System.out.println("Элемент найден!");
        else
            System.out.println("Элемент не найден!");




























        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }






}

