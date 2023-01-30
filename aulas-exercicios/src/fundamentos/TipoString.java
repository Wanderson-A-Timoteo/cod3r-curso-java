package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		// String é um objeto imutável, não conseguimos alterar o seu valor original
		// apenas substituir
		
		String s = "Boa tarde";
		// Estamos substituindo o conteúdo
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		
		// metodo startsWith (inicia com) retorna um booleano
		System.out.println(s.startsWith("Boa"));
		
		// metodo startsWith (inicia com) retorna um booleano
		System.out.println(s.startsWith("BOA")); // Aqui retorna true pois mudamos para upperCase
		
		// metodo startsWith (termina com) retorna um booleano
		System.out.println(s.endsWith("BOA")); // Aqui retorna false pois mudamos termina com TARDE
				
		// Alteramos para minuscula depois compara
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		// Verifica o tamanho da string
		System.out.println(s.length());
		
		// Verifica se são iguais
		System.out.println(s.equals("boa tarde")); // Retorna false pois esta com UpperCase
		
		// Verifica se são iguais ignorando a transformação para UpperCase
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Retorna true pois ignora o upperCase
		
		var nome = "Wanderson";
		var sobrenome = "Timóteo";
		var idade = 38;
		var salario = 12345.987;
		
		// Podemos escrever a instrução toda na mesma linha
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario);
		
		// Podemos escrever a instrução toda na mesma linha mas na impressão pular linha com \n
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
				
		// Podemos escrever a instrução toda pulando linha para ficar mais legível sem alterar o resultado
		System.out.println("Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade + "\nSalario: " 
				+ salario + "\n\n");
		
		// Podemos subistituir as variaveis string com %s e numerico por %d e double por %f
		// com o metodo printf
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f de salário.", 
				nome, sobrenome, idade, salario);
		
		// Podemos formatar uma frase inteira usando o metodo String.format
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f de salário.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));

		System.out.println("Frase qualquer".indexOf("qual"));

		System.out.println("Frase qualquer".substring(6));
		
		// Em substring entra o primeiro parametro mais não entra o ultimo
		// Neste exemplo entrará de 6 até o 8
		System.out.println("Frase qualquer".substring(6, 9));
				
	}
}
