package ex03;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1ª nota");
        double nota1 = input.nextDouble();

        System.out.println("Digite a 2ª nota");
        double nota2 = input.nextDouble();

        double calculo = (nota1 + nota2) / 2;

        if (calculo == 10) {
            System.out.println("Aprovado com distinção");
        } else if (calculo >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        input.close();
    }
}
