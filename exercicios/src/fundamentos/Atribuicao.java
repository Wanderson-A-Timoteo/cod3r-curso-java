package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		// Formas diferentes de atribuir uma variavel em outra
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		System.out.println(c);
				
		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
		
	}
}
