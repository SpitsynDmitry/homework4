public class Main {
    public static void main(String[] args) {
//Задание 1
        int total = 0;
        int i = 0;
        while (total < 10) {
        total = total + 1;
            System.out.print(total + " ");
        }
        System.out.println(" ");
    for (int n = 10; n >= 1; n=n-1) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
// Задание 2

        for (int n = 6; n <= 31; n= n + 7) {
            System.out.println( " Сегодня пятница " + n +" число. Необходимо подготовить отчет");
        }

        // Задание 3
        for (int year = 0; year < 2122; year = year + 79) {
            if (year >= 1822 && year < 2122) {
                System.out.println(year);
            }
        }

    }
}