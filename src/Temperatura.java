//Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit");
        double fahr = input.nextDouble();

        double resultado = (fahr - 32) / 1.8;

        System.out.println("A temperatura em graus Celsius é: " + (Math.floor(resultado)));
    }
}
