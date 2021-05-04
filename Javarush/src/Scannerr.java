import java.util.Scanner;


public class Scannerr {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan= new Scanner(System.in);

        //For string

        String text1= scan.nextLine();
        String text2= scan.nextLine();
        String text3= scan.nextLine();

        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();

        int num = (num1+num2+num3)/3;

        System.out.println(num);


        System.out.println(text3);
        System.out.println(text2.toUpperCase());
        System.out.println(text1.toLowerCase());

    }
}
