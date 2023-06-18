package combustivel;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		double g = 2.50;
		double a = 1.90;
	
		
		System.out.println("Informe o tipo de combustivel onde G (gasolina) e A (alcool)!");
	char resp;
	resp =ent.next().charAt(0);
	
	System.out.println("Informe quantos litros deseja abastecer? ");
	double litros = ent.nextDouble();
	
	double precoGa = litros * g;
	double precoAl = litros * a;
	double desc1G = precoGa * 4/100;
	double desc2G =  precoGa * 6/100;
	double desc1A = precoAl * 3/100;
	double desc2A = precoAl * 5/100;
	double precoG = 0;
	double precoA = 0;
	
	ent.close();
	
	if((resp == 'G')||(resp == 'g')) {
	if(litros <= 20) { 
		precoG = precoGa - desc1G;
		System.out.println("Valor a pagar R$" + precoG);
		  }
		if(litros > 20) {
			precoG = precoGa - desc2G;
		}
			System.out.println("Valor a pagar R$" + precoG);
		
	}
		if((resp == 'A')||(resp == 'a')) {
		if(litros <= 20 ) { 
				precoA = precoAl - desc1A;	
				System.out.println("Valor a pagar R$" + precoA);
			}
			if(litros > 20) {
				precoA = precoAl - desc2A;
			}
				System.out.println("Valor a pagar R$" + precoA);
				}
	}
		
	}
		
	
	

