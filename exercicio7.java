package listae2;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int um = 0;
		int dois = 0;
		int tres = 0;
		
		System.out.println("Informe o primeiro numero");
		um = ent.nextInt();
		System.out.println("Informe o segundo numero");
		dois = ent.nextInt();
		System.out.println("Informe o terceiro numero");
		tres = ent.nextInt();
		
		ent.close();
		
		if(um > dois && um > tres) {
			System.out.println("O maior numero foi "+ um);
			}else if(dois > um && dois > tres) {
			System.out.println("O maior numero foi "+ dois);
		}else if(tres > um && tres > dois) {
			System.out.println("O maior numero foi "+ tres);
			
		}if (um < dois && um < tres) {
			System.out.println("O menor numero foi "+ um);
		}else if(dois < um && dois < tres ) {
			System.out.println("O menor numero foi "+ dois);
		}else if(tres < um && tres < dois) {
			System.out.println("O maior numero foi "+ tres);
		}
	}

}
