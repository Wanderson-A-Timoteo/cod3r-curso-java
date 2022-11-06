package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		// ++a == b--   -> Neste caso o resultado é verdadeiro devido a precedencia, o  
		// programa vai incrementar "A" depois fará a comparação emtre "A" e "B", ou seja,  
		// A = 1 + 1 e B = 2, somente depois de fazer a comparação que ele fará o incremento em "B".
		System.out.println(++a == b--); // true
		System.out.println(a == b); // false
		System.out.println(a);
		System.out.println(b);
	}
}
