package ex01;//Faça um programa que converta metros para centímetros.

import java.util.Scanner;

public class Metros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros:");
        double metros = input.nextDouble();

        double resultado = metros * 100;
        System.out.println(metros + " metros são " + resultado + " centímetros!");

        input.close();
    }
}
