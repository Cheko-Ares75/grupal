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
		NealSuma inst  = new NealSuma();
		Resta objResta=new Resta();
		Fibonnaci objFibonacci=new Fibonnaci();
		Romanos objromano = new Romanos ();
		do {
			System.out.println();
			System.out.println();
			System.out.println("Ingrese opción: ");
			System.out.println("MENÚ:");
			System.out.println("Opción 1:");
			System.out.println("Opción 2: Calcular números romanos hasta el 50.");
			System.out.println("Opción 3: Suma de números decimales.");
			System.out.println("Opción 4: Serie de fibonaci hasta la posición 54.");
			System.out.println("Opción 5:");
			System.out.println("Opción 6:");
			System.out.println("Opción 7:");
			System.out.println("Opción 8: Salir");
			opcion = objEntrada.nextInt();
			switch (opcion) {
			case 1:
				objResta.restar();
				break;
			case 2:
				objromano.Solicitar();
				objromano.Imprimir();
				break;
			case 3:
				Scanner captura = new Scanner(System.in);
				System.out.println("Digite valor 1:");
				float valor1 = captura.nextFloat();
				System.out.println("Digite valor 2:");
				float valor2 = captura.nextFloat();
				inst.suma(valor1, valor2);
				break;
			case 4:
				objFibonacci.calcular();
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
				System.out.println("El programa se ha cerrado de manera exitosa!");
				System.exit(0);
				break;
			default:
				System.out.println("Número inválido");
				break;
			}
		} while (opcion != 8);
		objEntrada.close();
	}
}
