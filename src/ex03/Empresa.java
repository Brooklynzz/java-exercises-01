package ex03;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador");
        double salario = input.nextDouble();

        System.out.println("Salário do colaborador antes do reajuste é de: " + salario + " R$");

        if (salario <= 280.0) {
            double aumento20 = (salario * 20) / 100;
            salario += aumento20;
            System.out.println("O aumento aplicado foi de 20%, logo: " + aumento20 + " R$");
        } else if (salario > 280.0 && salario <= 700.0) {
            double aumento15 = (salario * 15) / 100;
            salario += aumento15;
            System.out.println("O aumento aplicado foi de 15%, logo: " + aumento15 + " R$");
        } else if (salario > 700.0 && salario <= 1500.0) {
            double aumento10 = (salario * 10) / 100;
            salario += aumento10;
            System.out.println("O aumento aplicado foi de 10%, logo: " + aumento10 + " R$");
        } else {
            double aumento5 = (salario * 5) / 100;
            salario += aumento5;
            System.out.println("O aumento aplicado foi de 5%, logo: " + aumento5 + " R$");
        }
        System.out.println("O novo salário do colaborador é de: " + salario);
        input.close();
    }

}
