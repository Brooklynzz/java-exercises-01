package ex01;//Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        double resp = input.nextDouble();

        System.out.println("E quantas horas você trabalhou esse mês?");
        double horas = input.nextDouble();

        double resultado = resp * horas;
        System.out.println("O valor recebido é de " + resultado);

        input.close();
    }
}
