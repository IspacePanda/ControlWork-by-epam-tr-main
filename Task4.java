package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("¬ведите колл. чисел--->");
			int n = sc.nextInt();

			int mas[] = new int[n];
			boolean isSimple = false;
			Random rand = new Random();

			for (int i = 0; i < n; i++) {
				mas[i] = rand.nextInt(10);
				System.out.println("номер €чейки --->>[" + i + "]   число === " + mas[i]);
			}

			for (int i = 0; i < n; i++) {
				isSimple = numberIsSimple(mas[i]);
				if (isSimple) {
					continue;
				}
				System.out.println("номер €чейки с простым числом ----> " + i);
			}
		}

	}

	public static boolean numberIsSimple(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;

	}
}