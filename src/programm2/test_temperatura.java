package programm2;
/**
 * 
 * @author dante
 *
 */
public class test_temperatura {
	static double Farenheit;
	static double Celsius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_temperatura x;
		x = new test_temperatura();
		Farenheit = x.celsisusToFarenheit(10);
		Celsius = x.farenheitToCelsius(10);
		System.out.println("10 grados Celsius en Farenheit es " + Farenheit);
		System.out.println("10 grados Farenheit en Celsius es " + Celsius);
	}

}