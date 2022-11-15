//Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String aluno = input.nextLine();
        System.out.println("Digite a nota do aluno no 1° Bimestre");
        double bim1 = input.nextDouble();
        System.out.println("Digite a nota do aluno no 2° Bimestre");
        double bim2 = input.nextDouble();
        System.out.println("Digite a nota do aluno no 3° Bimestre");
        double bim3 = input.nextDouble();
        System.out.println("Digite a nota do aluno no 4° Bimestre");
        double bim4 = input.nextDouble();

        double calc = bim1 + bim2 + bim3 + bim4;
        double resultado = calc / 4;
        System.out.println("A média geral do(a) aluno(a) " + aluno +  " é: " + resultado);

    }
}
