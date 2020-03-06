package by.antonau;

import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0;
        sum(x, sum);
    }
    public static void sum(int x, int sum){
        if(x != 0){
            sum += x % 10;
            sum(x / 10, sum);
        }
        else System.out.println(sum);
    }
}
