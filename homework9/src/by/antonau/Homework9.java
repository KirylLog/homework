package by.antonau;

public class Homework9 {

    public static void main(String[] args) {
        int numbers[] = new int[20];
        int MaxNumber = numbers[0];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 20);
            System.out.print(" " + numbers[i] + " ");
        }
            for(int i = 0; i< numbers.length; i++)
                if(MaxNumber < numbers[i])
                MaxNumber = numbers[i];
        System.out.println(" ");
            System.out.println("Максимальное число "+ MaxNumber +" ");
        }
    }






