package by.antonau;

import java.util.Scanner;

public class Homework12 {

    public static void main(String[] args) {
        System.out.println("Введите любое число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String str = Integer.toString(number);
        char[] strToArray = str.toCharArray();
        int i;
        for (i = 0; i < strToArray.length; i++) {
            if (i % 3 != 0) {
                System.out.print(strToArray[i]);
            } else {
                System.out.print(" " + strToArray[i]);
            }


        }

    }

}

