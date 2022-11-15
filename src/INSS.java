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
        double ir = (salarioBruto * 11) / 100;

        double salarioLiq1 = salarioBruto - ir;
        double inss = (salarioLiq1 * 8) / 100;

        double salarioLiq2 = salarioLiq1 - inss;
        double sindicato = (salarioLiq2 * 5) / 100;

        double resultado = salarioLiq2 - sindicato;
        System.out.println("Seu salário esse mês é de: " + (Math.floor(resultado)));
    }
}
