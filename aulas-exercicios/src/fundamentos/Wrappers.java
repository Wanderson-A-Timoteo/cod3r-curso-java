package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		// Converter string em numero inteiro
		Integer ii = Integer.parseInt("10000"); // int
		Long l = 100000L;
		
		// next() -> Recebe uma entrada string e parseInt converte a string para inteiro
		Integer iii = Integer.parseInt(entrada.next());
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(iii);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		// Conversão do tipo booleano
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		entrada.close();
	}
}
