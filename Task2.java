package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите коллчество чисел ---->");

		int n = sc.nextInt();

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
			System.out.println("номер €чейки[" + i + "]=" + mas[i]);
		}
		System.out.println("колличество чисел  больше 15-ти или меньше 2  --->" + numbers(mas));
		System.out.println("—умма чисел этих чисел = " + summNumbers(mas));
	}

	public static int numbers(int[] arr) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 15 || arr[i] < 2) {
				x++;
			}
		}
		return x;
	}

	public static int summNumbers(int[] mas) {
		int x = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 5 == 4) {
				x = mas[i];
			}
		}
		return x;
	}
}