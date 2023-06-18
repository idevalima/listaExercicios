package media;
import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args ) {
		Scanner ent = new Scanner (System.in);
		System.out.println("Informe a primeira nota");
		double nota1 = ent.nextDouble();
		System.out.println("Informe a segunda nota");
		double nota2 = ent.nextDouble();
		double total = nota1 + nota2;
		
		if(total<=4.0) {
			System.out.print(" Seu Conceito - E -");
			System.out.print(" Sua media - \n"+(nota1 + nota2));
			System.out.print("-  Reprovado ");
			
		}
		if((total>4.0) && (total<=6.0)){
			System.out.print(" Seu Conceito - D - ");
			System.out.print(" Sua media - "+ (nota1+nota2));
			System.out.print("-  Reprovado ");
		}
		if((total> 6.0)&& (total <= 7.5)) {
			System.out.print(" Seu Conceito - C - ");
			System.out.print(" Sua media - "+(nota1+nota2));
			System.out.print("-  Aprovado ");
	}
		if((total>7.5)&& (total <=9.0)) {
			System.out.print(" Seu Conceito - B -");
			System.out.print(" Sua média - "+(nota1+nota2));
			System.out.print(" - Aprovado ");
	}
		if((total> 9.0)&&(total <= 10)) {
			System.out.print(" Seu Conceito - A -");
			System.out.print(" Sua média - "+ (nota1+nota2));
			System.out.print(" - Aprovado com Exelência!");
		}
	}

}
