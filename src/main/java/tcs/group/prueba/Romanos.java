package tcs.group.prueba;

import java.util.Scanner;

public class Romanos {
	private static Scanner in;
	String romano = "";
	int num=0;
	public void Solicitar() {
		in = new Scanner(System.in);
		System.out.println("PROGRAMA QUE CALCULA NÚMEROS ROMANOS - CARLOS SARMIENTO");
		System.out.println("Ingrese el número a convertir (máximo el 50): ");
		num = in.nextInt();
	}
	public void Imprimir() {
		
		int uni,dec;
		uni = num%10;
		dec = num/10;
		if (dec == 5) {
			romano = romano + "L";
		}		
		else if (dec == 4) {
			romano = romano + "XL";
		}
		else {
			for (int j=1;j<=dec;j++) {
				romano = romano + "X";
			}
		}
		if (uni == 9) {
			romano = romano + "IX";
		}		else if (uni >= 5) {
			romano = romano + "V";
			for (int i = 6; i<=uni;i++) {
				romano = romano + "I";
			}
		}
		else if (uni == 4) {
			romano = romano + "IV";
		}
		else {
			for (int j=1;j<=uni;j++) {
				romano = romano + "I";
			}
		}
		System.out.println(romano);
	}
}
