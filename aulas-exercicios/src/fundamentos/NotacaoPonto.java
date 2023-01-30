package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a =  2.3;
		
		// String não é um Tipo Primitivo
		String s = "Bom dia X";
		
		// replace -> substituir
		s = s.replace("X", "Senhora"); // Substitui X por Senhora
		s = s.toUpperCase();
		s =s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Wanderson".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Wanderson")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos Primitivos não tem o operador "."
	}
}
