package inteiro;
import java.util.Scanner;

public class exercicio23 {
	public static void main(String[] args) {

	Scanner ent = new Scanner (System.in);
	System.out.println("Informe um nmero");
	double num = ent.nextDouble();
	ent.close();
	
	if (Math.floor(num)<num){
		System.out.println("Numero decimal");
	}else {
		System.out.println("Numero inteiro");
		
	}
}
}
