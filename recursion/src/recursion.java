/**
 * Обязательно указывать когда прекратить рекурсию
 * каждая рекурсивная функция состоит из 2х частей:
 * 1. базовый случай (функция себя не вызывает, чтоб предотвратить зацикливание)
 * 2. рекурсивный случай (функция вызывает сама себя)
 */

public class recursion {

    public static void count(int i){
        System.out.println(i);

        if(i<=10) {
           return;

        }else{
            count(i-1);
        }
    }


    public static void main(String[] args) {

    count(28);
    }
}
