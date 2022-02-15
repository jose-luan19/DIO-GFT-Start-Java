package br.com.dio;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double N;
		int quociente, resto;
		N = Double.parseDouble(sc.nextLine());

		int[] nota = { 100, 50, 20, 10, 5, 2 };
		int[] moeda = { 100, 50, 25, 10, 5 };
		double[] modedaDouble = { 1.00, 0.50, 0.25, 0.10, 0.5};

		resto = (int) (N * 100.0 + 0.5);
		// resto = (int) Math.round(N);

		System.out.println("NOTAS:");

		for (int i : nota) {
			quociente = resto / (i * 100);
			System.out.println(quociente + " nota(s) de R$ " + i + ".00");
			resto = resto % (i * 100);
		}

		System.out.println("MOEDAS:");

		for (int i=0; i< moeda.length ; i++) {
	
			quociente = resto / moeda[i];
			System.out.printf("%d moeda(s) de R$ %.2f\n", quociente , modedaDouble[i]);
			resto = resto % moeda[i];

		}

		System.out.println(resto + " moeda(s) de R$ 0.01");

		sc.close();

	}
}
