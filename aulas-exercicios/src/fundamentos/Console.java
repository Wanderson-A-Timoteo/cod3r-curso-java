package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		// O metodo print não pula linha e \n quebra de linha
		System.out.print("Bom ");
		System.out.print("dia!\n\n");
		
		// O metodo println pula linha
		System.out.println("Bom");
		System.out.println("dia");
		
		// Formatação e %n quebra de linha
		System.out.printf("Megasena: %d, %d, %d, %d, %d, %d %n", 
				1, 3, 16, 23, 44, 55);
		
		// Formatação com apenas uma casa decimal após o ponto e com arredondamento para cima ou para baixo
		System.out.printf("Salário: %.1f", 1525.2645);
		
		// Scanner observa tudo o que é digitado no teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		// Scanner fica usando recursos do sistema por isso precisamos fecha-lo
		// quando não formos mais utiliza-lo
		entrada.close();
	}
}
