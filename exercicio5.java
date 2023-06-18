package listao2;
import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		double um = 0;
		double dois =0;
		
		
		System.out.println("informe a primeira nota do aluno");
		um = ent.nextDouble();
		System.out.println("Informe a segunda nota do aluno");
		dois = ent.nextDouble();
		double total = um + dois;
		
		ent.close();
		
		if(total== 10) {
			System.out.println("Aprovado com distição");
			
		}else if(total >= 7) {
			System.out.println("Aprovado");
			
		}else if (total < 7){
			System.out.println("Reprovado");
	}
	}

}
