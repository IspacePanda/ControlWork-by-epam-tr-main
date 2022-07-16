package by.epam.tr.main;

public class Task3 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 7;
		double h = 0.2;
		double n = 0.0;

		System.out.println(" --------------------");
		System.out.println("|   x   |   y   |");

		for (double i = a; i <= b; i += h) {

			n = Math.tan(i);
			System.out.println(" -----------------------");
			System.out.printf("|%-11f|%-11f|\n", i, n);
		}

		System.out.println(" ------------------------");
		System.out.println();
	}

}
