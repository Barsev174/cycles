import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int i = 1;
        while (i <= 10 ) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (--i; i>= 1; i--) {
            System.out.print( i + " ");
        }
        System.out.println();


        //Задача 2
        System.out.println("Задача 2");

        int h = 3;
        while (h <= 31) {
            System.out.println("Сегодня пятница," + h + "-е число. Необходимо подготовить отчет.");
            h+=7;
        }


        // Задача 3
        System.out.println("Задача 3");
        int start = 0;
        int period = 1822;
        int finish = 2122;

        for ( int year = start; year <= finish; year+=79) {
            if (year >= period) {
                System.out.println(year);
            }
        }


    }
}