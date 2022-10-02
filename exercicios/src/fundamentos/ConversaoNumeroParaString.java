package fundamentos;

public class ConversaoNumeroParaString {

	public static void main(String[] args) {
		
		// Conversão de um numero para string
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		// Uma das vantagens em converter de numero para string é que após a conversão 
		//  é possível o tamanho da string com o metogo lenght()
		Integer num2 = 104564320;
		System.out.println(num2.toString().length());
		
		Integer num3 = 104564320;
		System.out.println(Integer.toString(num3)); // Podemos converter desta forma passando o tipo no inicio
		
		
	}
}
