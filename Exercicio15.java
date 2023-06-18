package triangulo;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Informe primeiro lado do triangulo");
		double l1 = ent.nextDouble();		
		System.out.print("Informe segundo lado do triangulo");
		double l2 = ent.nextDouble();
		System.out.print("Informe terceiro lado do triangulo");
		double l3 = ent.nextDouble();
		double soma = l1+l2;
		
		ent.close();
		
		if(soma < l3) {
			System.out.print( " Não é triangulo " );
		
		}
		else if((l1 == l2)&& (l2==l3)&&(l3==l1)) {
			System.out.print(" triangulo Equilatero ");
		}
		else if((l1==l2)&& (l2!= l3)) {
			System.out.print(" triangulo Isoscéles ");
		}
		else if((l1 != l2)&& (l2 != l3)&& (l3 != l1)) {
			System.out.print(" triangulo Escaleno ");
		}
		
		}
		
	}


