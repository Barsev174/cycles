import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (--i; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Задача 2
        System.out.println("Задача 2");

        int h = 3;
        while (h <= 31) {
            System.out.println("Сегодня пятница," + h + "-е число. Необходимо подготовить отчет.");
            h += 7;
        }


        // Задача 3
        System.out.println("Задача 3");
        int start = 0;
        int period = 1822;
        int finish = 2122;

        for (int year = start; year <= finish; year += 79) {
            if (year >= period) {
                System.out.println(year);
            }
        }

        //Задача 4
        System.out.println("Задача 4");

        for (int l = 1; l <= 30; l++) {
            System.out.print(l + ":");
            if (l % 3 == 0) {
                System.out.print(" ping");
            }
            if (l % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println();

        }

        // Задача 5
        System.out.println("Задача 5");
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a + " ");
        System.out.print(b);
        for (int n = 3; n <= 10; n++) {
            System.out.print(" " + (temp = a + b));
            a = b;
            b = temp;


        }

    }
}