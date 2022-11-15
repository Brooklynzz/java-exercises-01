package ex03;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num1 = input.nextInt();
        System.out.println("Digite outro número inteiro");
        int num2 = input.nextInt();

        int resultado = Math.max(num1,num2);
        System.out.println("O maior número entre " + num1 + " e " + num2 + " é: " + resultado);

        input.close();
    }
}
