package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		// Conversão de um numero inteiro em double ocorre de forma inplícita
		double a = 1; // Implícita
		System.out.println(a);
		
		double e = 1.998977; 
		int ff = (int) e;// Exlícita
		System.out.println(ff);
		
		// Conversão explícita sem perda de valor
		float b = (float) 1.2034;
		System.out.println(b);
		
		// Conversão explícita ou CAST com perda de valor, o valor é truncado pois não 
		//  suporta número long, desta forma mesmo não suportando o Java converte 
		//  truncando para float gerando perda de dados sem explicitar com (float) gera erro.
		float f = (float) 1.203444567788888; // Explícita (CAST)
		System.out.println(f);
		
		// Conversão sem perda de valor pois o double suporta número long
		double fd = 1.203444567788888;
		System.out.println(fd);
		
		// Conversão de int que é maior que byte precisa ser explícita
		int c = 4;
		byte bb = (byte) c; // Neste caso não gera perda
		System.out.println(bb);
		
		// Conversão de int que é maior que byte precisa ser explícita
		int cc = 130;
		byte bbb = (byte) cc; // Neste caso gera perda pois a conversão força ser truncada
		System.out.println(bbb);  // Explícita (CAST)
	}
}
