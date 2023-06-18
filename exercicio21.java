package caixaEletronico;

import java.util.Scanner;

public class exercicio21 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;
		
		
		System.out.println("Informe o Valor que deseja sacar: ");
		int saque = ent.nextInt();
		ent.close(); 
		
		if((saque > 600)|| (saque < 10)){
			System.out.println("Saque invalido");
		}
		if(saque >=100 ) {
		n100 = saque /100;
		saque = saque %100;
		System.out.println(n100 + " Nota de 100");
	}
	if(saque >=50) {
		n50 = saque /50;
		saque= saque % 50;
		System.out.println(n50 +" Nota de 50 "  );
	}
	if(saque >= 10) {
		n10 = saque/10;
		saque = saque%10;
		System.out.println(n10 +" Nota de 10 " );
	}
	if(saque >= 5) {
		n5 = saque / 5;
		saque = saque % 5;
		System.out.println(n5 +" Nota de 5 "  );
	}
	if (saque >= 1) {
		n1 = saque /1;
		System.out.println(n1 +" nota de 1");
		
	}
	}
}
