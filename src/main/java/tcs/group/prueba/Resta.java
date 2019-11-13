package tcs.group.prueba;

import java.util.Scanner;

public class Resta {
	public  void restar() {

		Scanner entrada = new Scanner(System.in);
		int a, b, total;
		System.out.println("      RESTA       ");
		System.out.println("Digite el primer numero");
		a = entrada.nextInt();
		System.out.println("Digite el segundo numero");
		b = entrada.nextInt();
		total = a + b;
		System.out.println(a + " - " + b + " = " + total);
	}
}
