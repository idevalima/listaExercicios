package medianota;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		System.out.println("Informe a primeira nota");
		double nt1 = ent.nextDouble();
		System.out.println("Informe a segunda nota");
		double nt2 = ent.nextDouble();
		System.out.println("Informe a terceira nota");
		double nt3 = ent.nextDouble();
		ent.close();
		
		double nota = nt1 + nt2 + nt3;
		double media = nota / 3;
		
		if(media == 10) {
			System.out.println(" Aprovado com Distinção,  Sua media è " + media  );
		}
		else if (media < 10 && nota >=7){
			System.out.println(" Aprovado, Sua media é " + media );
		}
		else if(media < 7) {
			System.out.println("Reprovado, Sua media é " + media );
		}
	}

}
