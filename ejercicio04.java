package capitulo04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Dime el primer numero");
			num1 = sc.nextInt();
			System.out.println("Dime el segundo numero");
			num2 = sc.nextInt();

		} while (num1 != num2);

	}

}