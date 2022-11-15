package ex02;

import java.util.Scanner;

public class Joao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("João, digite o peso dos seus peixes de hoje :D");
        double peso = input.nextDouble();

        if (peso > 50) {
            peso -= 50;
        }
        double excesso = peso * 4;
        String multa = excesso + " R$";
        System.out.println("João, você excedeu " + peso + " quilos");
        System.out.println("Sua multa é de: " + multa);

        input.close();
    }
}
