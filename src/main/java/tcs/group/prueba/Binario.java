package tcs.group.prueba;

public class Binario {

	

	public String binario(double num) {
		double exp;
		int numeroEnt, residuo, modulo, iNum;
		String salidaInv = "", salida = "";

		exp = Math.log(num) / Math.log(2);

		numeroEnt = (int) Math.ceil(exp);

		for (int i = 1; i <= numeroEnt; i++) {

			iNum = (int) num;
			modulo = iNum % 2;
			num = num / 2;
			salidaInv = salidaInv + modulo;
		}

		iNum = (int) num;
		if (iNum == 0) {

		} else {
			salidaInv = salidaInv + iNum;
		}

		for (int x = salidaInv.length() - 1; x >= 0; x--)
			salida = salida + salidaInv.charAt(x);

		// System.out.println(salida);
		return salida;
	}

}
