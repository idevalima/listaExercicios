package turno;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe seu horario de Estudo onde");
		System.out.print("M para Matutino, V para Vespertino e N para Noturno ");

char turno = ent.next().charAt(0);
ent.close();
		
		if((turno =='m')|| (turno=='M')){
			System.out.print("Bom dia");
			
		}else if((turno=='v')||(turno=='V')) {
			System.out.print("Boa Tarde");
			
		}else if ((turno=='n')||(turno =='N')) {
			System.out.print("Boa Noite");
			
		}else {
			System.out.print("Valor Invalido");
		}
			
			}

	}


