package aumentoSalarial;
import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Informe o seu salario");
		double salario = ent.nextDouble();
		
		ent.close();
		
	if(salario <= 280 ) {
		double novosalario = salario + salario*20/100;
		System.out.println("Seu salario era \n "+ salario);
		System.out.println("Seu aumento foi de 20% \n"+ (novosalario - salario));
		System.out.println("Seu novo salario é \n"+ novosalario);
		
	}
	if ((salario >280)&& (salario <= 700)){
		double novosalario = salario + (salario * 15/100 );
		System.out.println("Seu salario era \n "+ salario);
		System.out.println("Seu aumento foi de 15% \n"+ (novosalario - salario));
		System.out.println("Seu novo salario é \n"+ novosalario);
		
		
	} 
	if((salario > 700) &&(salario <= 1500)) {
		double novosalario = salario + (salario * 10/100);
		System.out.println("Seu salario era \n "+ salario);
		System.out.println("Seu aumento foi de 10% \n"+ (novosalario - salario));
		System.out.println("Seu novo salario é \n"+ novosalario);
		
	}
	if (salario > 1500 ) {
		double novosalario  = salario + (salario * 5/100);
		System.out.println("Seu salario era \n "+ salario);
		System.out.println("Seu aumento foi de 5% \n"+ (novosalario - salario));
		System.out.println("Seu novo salario é \n"+ novosalario);
		
	}
	}

}
