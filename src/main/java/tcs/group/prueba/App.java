package tcs.group.prueba;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int opcion;
		Scanner objEntrada = new Scanner(System.in);
		do {
			System.out.println("Ingrese opción: ");
			System.out.println("MENÚ:");
			System.out.println("Opción 1:");
			System.out.println("Opción 2:");
			System.out.println("Opción 3:");
			System.out.println("Opción 4:");
			System.out.println("Opción 5:");
			System.out.println("Opción 6:");
			System.out.println("Opción 7:");
			System.out.println("Opción 8: Salir");
			opcion = objEntrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Jefferson");
				break;
			case 2:
				Romanos objromano = new Romanos ();
				objromano.Solicitar();
				objromano.Imprimir();
				break;
			case 3:
				System.out.println("Neal");
				break;
			case 4:
				System.out.println("Diego");
				break;
			case 5:
				System.out.println("Kristian con K");
				break;
			case 6:
				System.out.println("Jorge");
				break;
			case 7:
				System.out.println("Jhon");
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Número inválido");
				break;
			}

		} while (opcion != 8);
	}
}
