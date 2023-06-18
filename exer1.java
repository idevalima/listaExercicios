package listaexerc;
import java.util.Scanner;
public class exer1 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("digite um numero");
		int num1 = ent.nextInt();
		System.out.println("digite outro numero");
		int num2 = ent.nextInt();
		
		
		if(num1 > num2) {
			System.out.println(num1);
			
		}else
			System.out.println(num2);
	}

}
