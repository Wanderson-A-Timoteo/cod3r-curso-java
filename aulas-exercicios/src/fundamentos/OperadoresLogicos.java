package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		System.out.println("Tabela verdade E (AND)");
		System.out.println("true  && true : " + (true && true));
		System.out.println("true  && false: " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false: " + (false && false));
		
		System.out.println("\nTabela verdade || -> OU (OR)");
		System.out.println("true  || true : " + (true || true));
		System.out.println("true  || false: " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false: " + (false || false));
		
		System.out.println("\nTabela verdade ^ -> OU exclusivo ( XOR ) ");
		System.out.println("true  XOR true : " + (true ^ true));
		System.out.println("true  XOR false: " + (true ^ false));
		System.out.println("false XOR true : " + (false ^ true));
		System.out.println("false XOR false: " + (false ^ false));
		
		System.out.println("\nTabela verdade Negação ( NOT ) ");
		System.out.println("!true : " + !true);
		System.out.println("!false: " + !false);
		
		System.out.println("\n Outros Exemplos:");
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		// Operador lógico && -> And
		System.out.println("true && (3 > 7): " + (condicao1 && condicao2));

		// Operador lógico || -> Ou
		System.out.println("true || (3 > 7): " + (condicao1 || condicao2));

		// Operador lógico ^ -> Xor
		System.out.println("true ^ (3 > 7): " + (condicao1 ^ condicao2));
		

		// Operador lógico ! -> Negação
		System.out.println("!true && (3 > 7): " + (!condicao1 && condicao2));

		// Operador lógico ! -> Negação
		System.out.println("true || !(3 > 7): " + (condicao1 || !condicao2));
	}
}
