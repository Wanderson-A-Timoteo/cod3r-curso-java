package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// Formula de conversão do de Fahrenheit para Celsius (ºF - 32) x 5/9 = ºC
		
		double fahrenheit = 110;
		final int NUM = 32;
		final double DIV = 5.0 / 9.0;
		double celsius = (fahrenheit - NUM) * DIV;
		System.out.println(celsius + "ºC");
		
	}
}
