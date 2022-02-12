package br.com.dio;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double area;

		double raio = Double.parseDouble(sc.nextLine());

		area = 3.14159 * (Math.pow(raio, 2));
		
		Integer.parseInt(null);

		System.out.printf("A=%.4f\n", area);
		System.out.printf("");

		sc.close();

		


	}
}
