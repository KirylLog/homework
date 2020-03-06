package by.antonau;

public class omework12 {

    public static void main(String[] args) {
	int number = 123456654;
        int s = 0;

        while(number != 0){
            s = number % 1000;
            System.out.print(s+" ");
            number = number / 1000;
        }
        System.out.println();
    }

}


