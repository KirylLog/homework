package by.antonau;

public class homework2 {
    public static void main (String[] args) {
        int s = 1000000;
        int sec;
        int m;
        int min, h;
        int d;
        int days;
        int w;
        int week;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        d = h % 24;
        days = (h - d) / 24;
        w = days % 7;
        week = (d - w) / 7;
        System.out.println(week + "недель " + days + "дней " + h + "часов " + min + "минут " + sec + "секунд");
    }
}