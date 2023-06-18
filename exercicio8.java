package listab2;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		double preco1 = 0;
		double preco2 = 0;
		double preco3 = 0;
		
		System.out.println("Informe o primeiro preço em reais");
		preco1 = ent.nextDouble();
		System.out.println("Informe o segundo preço em reais");
		preco2 = ent.nextDouble();
		System.out.println("Informe o terceiro preço em reais");
		preco3 = ent.nextDouble();
		
		ent.close();
		
		if(preco1 < preco2 && preco1 < preco3) {
			System.out.println("O menor preço foi R$ "+ preco1);
		}else if(preco2 < preco1 && preco2 < preco3) {
			System.out.println("O menor preço foi R$ "+ preco2);
		}else if(preco3 < preco1 && preco3 < preco2) {
			System.out.println("O menor preço foi R$ "+ preco3);
		}
	}

}
