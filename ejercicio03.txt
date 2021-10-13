package capitulo04;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main(String[] args) {
		int num1 = 0, suma = 0;
		for (int i = 0; i < 4; i++) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero"));

			suma = num1 + suma;

		}

		System.out.println("La suma de los numeros introducidos es: " + suma);
	}

}
