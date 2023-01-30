package fundamentos;

public class OperadoresLogicosDesafio {

	public static void main(String[] args) {
		
	// Trabalho na terça (V ou F)
	// Trabalho na quinta (V ou F)
	// Se vc trabalhar na terça e na quinta vc vai comprar uma TV de 50 polegadas
	// Se vc trabalhar apenas terça ou apenas na quinta vc vai comprar uma 
	//  TV de 32 polegadas e levar a familia para tomar sorvete
	// Se vc não trabalhar na terça e nem na quinta a familia vai ficar em casa
	
	boolean trabalho1 = true;
	boolean trabalho2 = false;
	
	boolean comprouTV50 = trabalho1 && trabalho2;
	boolean comprouTV32 = trabalho1 ^trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;
	// Operador Unário
	boolean maisSaudavel = !comprouSorvete;
	
	System.out.println("Comprou TV 50\"? " + comprouTV50);
	System.out.println("Comprou TV 32\"? " + comprouTV32);
	System.out.println("Comprou Sorvete? " + comprouSorvete);
	System.out.println("Mais saudável? " + maisSaudavel);
	
		
	}
}
