package listaa2;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		System.out.println("Digite uma letra");
		char letra = ent.next().charAt(0);
		
		ent.close();
		
		if(letra !='A' && letra != 'a' && letra != 'e' && letra != 'E' && letra != 'i'
&& letra != 'I' && letra != 'o' && letra != 'O' && letra != 'u' && letra != 'U') {
			System.out.println("essa letra e uma consoante");
			}else 
				System.out.println("Essa letra e uma vogal ");
		}
	}
