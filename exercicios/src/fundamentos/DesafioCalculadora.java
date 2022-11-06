package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler Num2
		// Ler o simbolo + - * / % e fazer a operação sobre o simbole digitado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		Double num1 = entrada.nextDouble();
	
		System.out.print("Digite o segundo numero: ");
		Double num2 = entrada.nextDouble();
	
		System.out.print("Digite o tipo de operação [+, -, *, / ou % ]: ");
		String tipoOperacao = entrada.next();
		
		// Lógica
		Double resultado = "+".equals(tipoOperacao) ? num1 + num2 : 0;
		resultado = "-".equals(tipoOperacao) ? num1 - num2 : resultado;		
		resultado = "*".equals(tipoOperacao) ? num1 * num2 : resultado;
		resultado = "/".equals(tipoOperacao) ? num1 / num2 : resultado;
		resultado = "%".equals(tipoOperacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, tipoOperacao, num2, resultado);
		
		entrada.close();
		
	}
}
