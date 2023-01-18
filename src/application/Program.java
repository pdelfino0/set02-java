package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for the course A?");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for the course B?");

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for the course C?");

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(a);
		total.addAll(b);
		
		System.out.println("Total students: " + total.size());
		
	}

}
