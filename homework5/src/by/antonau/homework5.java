package by.antonau;

public class homework5 {

    public static void main(String[] args) {
        int n = 3;
        if ((n % 100) == 11 | (4 < n & n < 21) |(n & 100) == 11) {
            System.out.println(n + " рублей");
        } else if (n % 10 == 1) {
            System.out.println( n + " рубль");
        } else if (1<(n % 10) & (n % 10) < 5) {
            System.out.println( n +" рубля");
        }
    }
}