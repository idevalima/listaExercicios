package centenasDezenas;

import java.util.Scanner;

public class Exercicio19 {
public static void main(String[] args) {
	Scanner ent = new Scanner (System.in);
	System.out.println("Digite um numero menor que mil");
	int numero = ent.nextInt();
	ent.close();
	
	int centena = numero / 100;
	int dezena = (numero % 100) / 10;
	int unidade = (numero % 100) % 10;
	
	System.out.println(+ centena +" Centenas");
	System.out.println(+ dezena +" Dezenas");
	System.out.println(+ unidade +" Unidades");
			
}
}
