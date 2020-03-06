package by.antonau;

public class Homework8 {
	public static void main(String[] args) {
		long factorial = 1;
		long i = 1;
		while (i <= 33) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of the number 33 = "+factorial);
	}
}

