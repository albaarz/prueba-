package programm2;

/**
 * 
 * @author dante
 *
 */
public class ejercicio4 {

	public static void main(String[] args) {
		double a;
		a = triangleArea(3, 3, 3);
		System.out.println("Un tri�ngulo con lados 3,3,3 tiene un �rea de:" + a);
		a = triangleArea(3, 4, 5);
		System.out.println("Un tri�ngulo con lados 3,4,5 tiene un �rea de" + a);
		a = triangleArea(9, 9, 9);
		System.out.println("Un tri�ngulo con lados 9,9,9 tiene un �rea de:" + a);
	}

	public static double triangleArea(int a, int b, int c) {
		double s = (a + b + c) / 2;
		Math.sqrt((s * (s - a) * (s - b) * (s - c)));
		return a;

	}
}