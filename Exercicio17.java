package avaliacaoA1;
import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
	
		try (Scanner ent = new Scanner (System.in)) {
			System.out.println("Digite o ano que deseja consultar\n");
			int ano = ent.nextInt();
			ent.close();
			if((ano % 400 == 0)|| (ano % 4 == 0 && ano % 100 != 0)){
				System.out.println("Ano BISSEXTO");	
				}

            else {
			System.out.println("Ano Não Bissexto");
			}
		}
	}

}

