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
		System.out.println("PROGRAMA QUE CALCULA LA SERIE DE FIBONACCI - DIEGO RODRÍGUEZ");
		do {
			verificador=true;
			System.out.println("Ingrese límite para la serie de fibonacci (Número positivo menor a 50):");
			limite=objEntrada.nextInt();
			if(limite<0 || limite >=50){
				verificador=false;
				System.out.println("El número debe ser positivo y no debe ser mayor a 50");
			}
				
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
