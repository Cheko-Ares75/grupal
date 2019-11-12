package tcs.group.prueba;

import java.util.Scanner;

public class Fibonnaci {
	Scanner objEntrada = new Scanner(System.in);
	int limite;
	int contador;
	boolean verificador;
	long fibonacci=1;
	long anterior=1;

	public void calcular() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("PROGRAMA DE DIEGO");
		do {
			verificador=true;
			System.out.println("Ingrese límite para la serie de fibonacci (Número positivo menor a 50):");
			limite=objEntrada.nextInt();
			if(limite<0 || limite >=50)
				verificador=false;
		} while (!verificador);
		contador=0;
		do {
			contador++;
			fibonacci=fibonacci+anterior;
			anterior=fibonacci-anterior;
			System.out.println(fibonacci);
		} while (contador < limite);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
