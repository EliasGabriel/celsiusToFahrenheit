/* Realiza un programa que pida por teclado un valor(grados cent�grados) y devuelva ese mismo valor convertido a fahrenheit.


NOTA: La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
F = 32 + ( 9 * C / 5) */

import java.util.Scanner;

public class actividad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double f ;
		double c = 0;
		
		System.out.print("Introduce la temperatura en grados celsius (c): ");
		c = sc.nextDouble();
		
		f = 32 + (9 * c / 5);
		
		System.out.println("La temperatura en grados fahrenheit es: " + f + "f");
		sc.close();
	}

}
