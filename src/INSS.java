//Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:

import java.util.Scanner;
public class INSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu ganho por hora");
        double valorRecebido = input.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        double horas = input.nextDouble();

        double salarioBruto = valorRecebido * horas;
        System.out.println("Seu salário bruto foi de: " + salarioBruto + " R$");

        double ir = (salarioBruto * 11) / 100;
        System.out.println("Você pagou ao Imposto de Renda: " + ir + " R$");

        double inss = (salarioBruto * 8) / 100;
        System.out.println("Você pagou ao INSS: " + inss + " R$");

        double sindicato = (salarioBruto * 5) / 100;
        System.out.println("Você pagou ao Sindicato: " + (Math.floor(sindicato)) + " R$");

        double somaTotal = ir + inss + sindicato;
        double resultado = salarioBruto - somaTotal;

        System.out.println("Seu salário líquido esse mês é de: " + (Math.floor(resultado)) + " R$");

        input.close();
    }
}
