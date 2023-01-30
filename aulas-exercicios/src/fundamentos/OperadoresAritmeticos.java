package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x * y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		
		// Efetuado CAST
		System.out.println("\nEfetuado CAST - Convertendo um valor inteiro para Double e Float");
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		// Modulo
		System.out.println("\nResto da divisão - Modulo ( % )");
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		int aa = 3 * 4 - 10;
		// Convertendo o resultado double para inteiro
		int bb = (int) Math.pow(aa, 3);
		System.out.println("Convertendo o resultado double para inteiro: " + bb);
		
		// Resultado double sem conversão
		double cc = Math.pow(aa, 3);
		System.out.println("Resultado double sem conversão: " + cc);
	}
}
