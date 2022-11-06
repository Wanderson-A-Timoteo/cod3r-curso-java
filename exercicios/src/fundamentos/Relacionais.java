package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		// Operadores Relacionais
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		// Hexadecimal correspondente a letra "A"
		System.out.println('\u0061');
		
		// Operadores relacionais e logico
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
