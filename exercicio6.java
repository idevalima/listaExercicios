package listad2;
import java.util.Scanner;

public class exercicio6 {
public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);
	int um = 0;
	int dois = 0;
	int tres = 0;
	System.out.println("Informe um numero");
	um = ent.nextInt();
	System.out.println("Informe outro numero");
	dois = ent.nextInt();
    System.out.println("Informe outro numero");
    tres = ent.nextInt();
    ent.close();
    
    if(um > dois && um > tres ) {
    	System.out.println("O numero maior é " + um );
    }
    else if(dois > um && dois > tres) {
    	System.out.println("O numero maior é " + dois );
    	}
    else if(tres > um && tres > dois) {
    	System.out.println("O numero maior é " + tres );
    }
}
}
