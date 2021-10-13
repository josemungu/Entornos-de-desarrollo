package capitulo04;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int num1, suma = 0, repeticion;
		float contador = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres meter: ");
		repeticion = sc.nextInt();

		for (int i = 0; i < repeticion; i++) {

			System.out.println("Dime el numero: ");
			num1 = sc.nextInt();

			if (num1 > 0) {

				contador++;
				suma += num1;
				

			} else {

				if (num1 < 0) {
					System.out.println("Dime un numero positivo");
					break;
				}

			}

		}
		System.out.println("La media es :" + suma/repeticion);
	}

}
