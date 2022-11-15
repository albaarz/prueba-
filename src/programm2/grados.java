package programm2;

/** @author dante */

public class grados{
	public double C;
	public double F;

	public double celsisusToFarenheit(double Celsius) {
		F = (1.8 * Celsius) + 32;
		return F;
	}

	public double farenheitToCelsius(double Farenheit) {
		C = (Farenheit - 32) / 1.8;
		return C;
		// System.out.println(Farenheit + "F en Celsius es " + C);
	}

}