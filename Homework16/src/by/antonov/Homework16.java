package by.antonov;

import java.util.Scanner;

public class Homework16 {

    public static void main(String[] args) {
        System.out.println("Задайте длину массива");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int array[] = new int[x]; // создание массива
        for (int i = 0; i < x; i++) {
            array[i] = (int) (Math.random() * 100 + 1); // заполнение элементами
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int i = array.length - 1;
        for (int j = 0; j <= array.length - 1; j++) {
            System.out.print(array[i] + " ");
            if (i >= 0)
                i = i - 1;
            else
                break;
        }
    }
}