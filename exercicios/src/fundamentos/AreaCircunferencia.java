package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		// final define a variavel como constante para não poder ser alterada o seu valor
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A área do raio é: " + area);
	}
}
