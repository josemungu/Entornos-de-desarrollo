package capitulo04;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contadorImpares = 0, comprobar, multiplicarImpares = 1;

		for (int i = 0; contadorImpares < 10; i++) {
			comprobar = i & 1;

			if (comprobar == 1) {
				multiplicarImpares *= i;
				contadorImpares++;
			}
		}
		System.out.println("Cuando se multiplican los numeros el resutlado es: " + multiplicarImpares);
	}

}
