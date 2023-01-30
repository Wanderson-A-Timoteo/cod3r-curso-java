package fundamentos;

import java.util.Scanner;

public class TipoStringIguais {

	public static void main(String[] args) {
		
		// Para comparação entre strings é essencial que seja feito com o metodo equals()
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		// Embora o conteúdo sejam iguais o resultado é falso, pois não esta comparando o conteúdo
		System.out.println("2" == s1); 
		// O metodo equals() compara o conteúdo, neste caso o resultado será verdadeiro
		System.out.println("2".equals(s1));
		
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite:");
		// O metodo next() remove os espaços em branco
		String s2 = entrada1.next();		
		// Mesmo usando trim() para remover os espaços o resultado é falso, devido o next()
		System.out.println("2" == s2.trim()); 
		System.out.println("2".equals(s2));
				
			
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite 2:");
		// O metodo nextLine() NÂO remove os espaços em branco
		String s3 = entrada2.nextLine();		
		// Mesmo usando trim() para remover os espaços o resultado é falso, devido o next()
		System.out.println("2" == s3.trim()); 
		// Já com o metodo equals() e trim(), assim é removido os espaços e o resultado é true
		System.out.println("2".equals(s3.trim())); // removendo os espaços é true
		System.out.println("2".equals(s3)); // sem remover os espaços é falso
		
		entrada1.close();
		entrada2.close();
		
	}
}
