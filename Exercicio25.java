package suspeitos;

import java.util.Scanner;
public class Exercicio25 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int sim = 0;
		System.out.println("Responda as perguntas com Sim ou Não! ");
		
		System.out.println("Telefonou para a vítima? ");
		String answ = ent.next();
		if(answ.equals("sim")) {
		sim +=1;
		}
		System.out.println("Esteve no local do crime?");
		answ = ent.next();
		if(answ.equals("sim")) {
		sim +=1;
		}
		System.out.println("Mora perto da vítima?");
		answ = ent.next();
		if(answ.equals("sim")) {
			sim +=1;
		}
		System.out.println("Devia para a vítima?");
		answ = ent.next();
		if(answ.equals("sim")) {
			sim +=1;
			
		}
		System.out.println("Já trabalhou com a vítima?" );
		answ = ent.next();
		if(answ.equals("sim")) {
			sim +=1;
			
		}
		if(sim ==2) {
			System.out.println("Entrevistado Suspeito!");
		}
		if((sim==3)||(sim==4)) {
			System.out.println("Entrevistado Cumplice!");
		}
		if(sim ==5) {
			System.out.println("Entrevistado Assassino!");
		}
		else {
			System.out.println("Entrevistado inocente! ");
		}
			
	}

}
