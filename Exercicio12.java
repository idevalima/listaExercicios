package folhaPagamento;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada");
        double valorhora = ent.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês ");
        double quanthora = ent.nextDouble();

        double salbruto = valorhora * quanthora;
        double inss = salbruto * 10 / 100;
        double fgts = salbruto * 11 / 100;
        double sind = salbruto * 3 / 100;
        double totaldesc = (inss + sind);
        double liquido = salbruto - totaldesc;

        ent.close();

        if (salbruto < 900) {
        	
            System.out.println("Salario bruto R$" + salbruto);
            System.out.println("sindicato R$" + sind);
            System.out.println("INSS - R$" + inss);
            System.out.println("FGTS - R$" + fgts);
            System.out.println("Total de descontos R$ " + totaldesc);
            System.out.println("Salario Liquido R$" + liquido);
        }
        if ((salbruto > 900) && (salbruto <= 1500)) {
            double ir = salbruto * 5/100;
            
            System.out.println("Salario bruto R$" + salbruto);
            System.out.println("sindicato R$" + sind);
            System.out.println("IR - R$" + ir);
            System.out.println("INSS - R$ " + inss);
            System.out.println("FGTS - R$" + fgts);
            System.out.println("Total de descontos R$ " + ( totaldesc + ir));
            System.out.println("Salario Liquido R$ " + (liquido - ir));
        }
        if ((salbruto > 1500) && (salbruto <= 2500)) {
            double ir = (salbruto * 10 / 100);

            System.out.println("Salario bruto R$" + salbruto);
            System.out.println("sindicato R$" + sind);
            System.out.println("IR - R$" + ir);
            System.out.println("INSS - R$ " + inss);
            System.out.println("FGTS - R$" + fgts);
            System.out.println("Total de descontos R$ " + (totaldesc + ir));
            System.out.println("Salario Liquido R$" + (liquido - ir));
        }
        if (salbruto > 2500) {
            double ir = (salbruto * 20 / 100);
            
            System.out.println("Salario bruto R$" + salbruto);
            System.out.println("sindicato R$" + sind);
            System.out.println("IR" + ir);
            System.out.println("INSS - R$" + inss);
            System.out.println("FGTS - R$ " + fgts);
            System.out.println("Total de descontos R$" + (totaldesc + ir));
            System.out.println("Salario liquido R$ " + (salbruto - totaldesc - ir));
            System.out.println("Salario Liquido R$" + (liquido - ir));
        }
    }
}