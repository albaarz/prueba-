/**
 * @author Alba Requena
 */
package programm2;

import java.util.Scanner;

public class area_circulo {
// Definimos la constante PI
	static final double PI = 3.14;

	void getArea() {
// Seguimos el siguiente método para calular el área 

		Scanner sc = new Scanner(System.in);
		// declaramos el área y el radio
		double a, r; 
		System.out.print("Introduce el radio de un circulo: ");
		//pedimos el radio
		r = sc.nextDouble();
		//ponemos la formula mediante la que se calcula el area del circulo 
		a = Math.PI * (r * r); 
		//ordenamos que se imprima el resuldo 
		System.out.println("El área del circulo es: " + r + " es: " + a);
	}

	public static void main(String args[]) {
		area_circulo c1 = new area_circulo();
		c1.getArea();
	}
}