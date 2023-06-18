package semana;
import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
	Scanner ent = new Scanner (System.in);
		System.out.println("Informe o dia da semana");
	System.out.println("1 domingo -2 segunda -3 terça -4 quarta -5 quinta -6 sexta -7 sabado ");
	int dia = ent.nextInt();
	
	if (dia == 1) {
		System.out.println("Domingo");
	}
		else if(dia==2) {
			System.out.println("Segunda");
	}
		else if(dia==3) {
			System.out.println("Terça");
		}
		else if(dia==4) {
			System.out.println("quarta");
		}
		else if(dia==5) {
			System.out.println("quinta");
		}
		else if(dia==6) {
			System.out.println("Sexta");
		}
		else if(dia==7) {
			System.out.println("Sabado");
		}
		else {
			System.out.println("Valor Invalido");
		}
}
}
