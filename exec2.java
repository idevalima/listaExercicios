package lista02;
import java.util.Scanner;
public class exec2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		System.out.println("informe um numero");
       int num = ent.nextInt();
       
       if(num == 0) {
    	   System.out.println("Numero neutro");
       }else if(num > 0) {
    	   System.out.println("Numero positivo");

       }else if(num < 0) {
    	   System.out.println("Numero negativo");
    	   
       }
       
	}
}
