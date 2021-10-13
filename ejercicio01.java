package capitulo04;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		int num1 = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero");
			num1 = sc.nextInt();
			suma = suma + num1;

		} while (num1 != 0);
		System.out.println("La suma es : " + suma);
		{

		}
	}

}
