package by.antonau;

public class homework6 {

	public static void main(String[] args) {

		int day = 2;
		int mount = 2;
		int year = 2020;
		int i = 1;

		while (mount == 2) {
			if (day > 30) {
				mount += i;
				day = 1;
			} else {
				day += i;

	    System.out.println(day + "." + mount + "." + year + ".");


			}
		}

	}
}




