package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		// Ternario = <expressão> ? <Valor se expressão verdadeira> : <Valor se expressão false>
		String resultadoParcial = media >= 5.0 ? "em Recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
				
		System.out.println("O aluno está " + resultadoFinal);
		
		// Converter um ternario para sim ou não
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
