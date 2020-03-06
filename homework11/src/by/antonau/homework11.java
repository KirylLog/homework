package by.antonau;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int n = 2; n < x; n++) {
            if (x % n == 0){
                System.out.println("Введенное Вами число, не является простым");
                break; }
            else if (x%x==0);
            System.out.println("Введенное Вами число,  является простым");
            break;
        }

    }
}



