package capitulo04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int nota, suspenso = 0, aprobado = 0, excelente = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();

			if (nota < 5) {
				suspenso++;
			}
			if (nota < 10) {
				aprobado++;
			}

			if (nota == 10) {
				excelente++;
			}
			if (nota > 10) {
				System.out.println("Nota incorrecta");
			}
		}

		System.out.println("Cantidad suspensos: " + suspenso);
		System.out.println("Cantidad aprobados: " + aprobado);
		System.out.println("Cantidad excelente: " + excelente);
	}

}
