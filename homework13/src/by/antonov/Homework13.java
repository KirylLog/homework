package by.antonov;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("Введите любое число");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x == 1)
            System.out.println("Введенное Вами число, не является простым");
        else if (x == 2)
            System.out.println("Введенное Вами число,  является простым");
        else
            for (int n = 2; n < x; n++) {
                if (x % n == 0) {
                    System.out.println("Введенное Вами число, не является простым");
                    break;
                } else if (x % x == 0) ;
                System.out.println("Введенное Вами число,  является простым");
                break;
            }

    }
}