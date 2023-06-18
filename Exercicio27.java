package fruteira;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		double vaMor1 = 2.50;
		double vaMor2 = 2.20;
		double vaMac1 = 1.80;
		double vaMac2 = 1.50;	
		
		System.out.println("Informe o peso das Maças!");
		double kgmaca = ent.nextDouble();
		
		System.out.println("Informe o peso dos Morangos!");
		double kgmorango = ent.nextDouble();
		
		double valormor = 0;
		double valormac = 0;
		double pesoTotal = 0;
		double valorTotal = 0;
		
		
		if(kgmorango <= 5) {
			valormor = kgmorango * vaMor1;
		}else if(kgmorango > 5) {
			valormor = kgmorango * vaMor2;
		}
		if(kgmaca <= 5) {
			valormac = kgmaca * vaMac1;
		}else if (kgmaca > 5) {
			valormac = kgmaca * vaMac2;
		}
			pesoTotal = kgmaca + kgmorango;
			valorTotal = valormor + valormac;
		
		if(pesoTotal > 8 || valorTotal > 25) {
			valorTotal = valorTotal - (valorTotal * 10/100);
		}
		System.out.printf("Valor Total a ser pago R$%.2f " , valorTotal );
	}

}
