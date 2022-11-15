package ex03;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do 1° produto em R$");
        double prod1 = input.nextDouble();
        System.out.println("Digite o valor do 2° produto em R$");
        double prod2 = input.nextDouble();
        System.out.println("Digite o valor do 3° produto em R$");
        double prod3 = input.nextDouble();

        double resulParcial = Math.min(prod1,prod2);
        double resultado = Math.min(resulParcial,prod3);

        System.out.println("O menor valor encontrado é: " + resultado + " R$");

        input.close();
    }
}
