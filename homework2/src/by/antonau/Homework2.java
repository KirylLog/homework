package by.antonau;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int sec;
        int m;
        int min;
        int h ;
        int d;
        int days;
        int w;
        int week;
        int hours;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = h % 60;
        days = (h - hours) / 24;
        w = days % 7;
        week = (days- d) / 7;
        System.out.println(week + "недель " + days + "дней " + h + "часов " + min + "минут " + sec + "секунд");
    }
}

