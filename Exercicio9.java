package decrecente;

import java.util.Scanner;

public class Exercicio9 {
	public static void main (String[] args) {
		Scanner ent = new Scanner (System.in);
		int a, b, c = 0;
		
		System.out.print("Digite um numero");
		a = ent.nextInt();
		System.out.print("Digite segundo numero");
		b = ent.nextInt();
		System.out.print("Digite terceiro numero");
		c = ent.nextInt();
		
		ent.close();
		
		if(a>b && b>c) {
					System.out.print(a +"-"+b+ "-"+c);
			}else if(a>c && c>b) {
				System.out.print(a+"-"+c+"-"+b);
				
				}if (b>a && a>c) {
					System.out.print(b+"-"+a+"-"+c);
				
				}else if(b>c &&c>a) {
					System.out.print(b+"-"+c+"-"+a);
			
		}if(c>a && a>b) {
			System.out.print(c+"-"+a+"-"+b);
				
			} else if(c>b && b>a) {
				System.out.println(c+"-"+b+"-"+a);
			}
		}
}

