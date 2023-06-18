package ano;
import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		System.out.println("Informe o ano na seguinte forma dd/mm/aaaa");
		System.out.println("Informe o dia");
		int dia = ent.nextInt();
		System.out.println("Informe o mês");
		int mes = ent.nextInt();
		System.out.println("Informe o Ano");
		int ano = ent.nextInt();
		
		short anoValido = 0;
		ent.close();
		
		if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
			if(dia<=31) {
				anoValido += 1;
				  }
				}
			else if(mes==4||mes==6||mes==9||mes==11) {
				if(dia<=30) {
				anoValido += 1;	
				}
			}
		if(mes==2) {
			if(ano % 400 == 0 ||ano % 4==0 && ano %100 != 0 ) {
				anoValido +=1;
			}
		}
		else if (dia <= 28) {
			anoValido +=1;
		}
		if(anoValido == 4) {
			System.out.println("Data Valida!");
		}else {
			System.out.println("Data Invalida!");
		}
		}
	}


 