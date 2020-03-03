package by.antonau;

public class homework6 {

    public static void main(String[] args) {

        int day = 1;
        int mount = 1;
        int year = 2020;
        int i = 1;

        while (year >= 2020 & mount <= 12 & year < 2030) { // ограничил до 2030
            if (mount == 1) {
                while (day < 31) {
                    day += i;
                    System.out.println(day + "." + mount + "." + year + ".");
                }
                mount += i;
                day = 1;
                System.out.println(day + "." + mount + "." + year + ".");
            } else if (mount == 2 && year % 4 == 0) { //условие на високосный год
                while (day < 29) {
                    day += i;
                    System.out.println(day + "." + mount + "." + year + ".");
                }
                mount += i;
                day = 1;
                System.out.println(day + "." + mount + "." + year + ".");

            } else if (mount == 2 && year % 4 != 0) { //условие на не високосный год
                while (day < 28) {
                    day += i;
                    System.out.println(day + "." + mount + "." + year + ".");
                }
                mount += i;
                day = 1;
                System.out.println(day + "." + mount + "." + year + ".");

            } else if (mount != 1 & mount != 2 & mount % 2 != 0) { // подсчёт дат нечётных месяцев
                while (day < 30) {
                    day += i;
                    System.out.println(day + "." + mount + "." + year + ".");
                }
                mount += i;
                day = 1;
                System.out.println(day + "." + mount + "." + year + ".");
            } else if (mount != 1 & mount != 2 & mount % 2 == 0) { // подсчёт дат чётных месяцев
                while (day < 31 & mount <= 12) {
                    day += i;
                    System.out.println(day + "." + mount + "." + year + ".");
                }
                mount += i;
                day = 1;
                if (mount <= 12) {  // ограничение 12-ю месяцами
                    System.out.println(day + "." + mount + "." + year + ".");
                }else {
                    year += 1;
                    mount = 1;
                }
            }
        }
        System.out.println("date is not relevant"); // сообщение о выходе за диапазон
    }
}

















