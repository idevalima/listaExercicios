package parimpar;
import java.util.Scanner; 

public class exercicio22 {
public static void main(String[] args) {
	Scanner ent = new Scanner (System.in);
	
	System.out.println("Informe um numero");
	int num = ent.nextInt();
	ent.close();
	
	if (num % 2 == 0) {
		System.out.println("Numero par");
	}else {
		System.out.println("Numero impar");
	}
			}
}
