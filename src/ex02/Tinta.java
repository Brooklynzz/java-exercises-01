package ex02;

import java.util.Scanner;

public class Tinta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho (Em m²) da área a ser pintada");
        double tamanho = input.nextDouble();

        if (tamanho % 18 == 0) {
            double galaoMaior = tamanho / 18;
            System.out.println("É necessário adquirir " + galaoMaior + " galões de 18 litros!");
            System.out.println("O valor é de " + galaoMaior * 80 + " R$");
        } else if (tamanho % 3.6 == 0) {
            double galaoMenor = tamanho / 3.6;
            System.out.println("É necessário adquirir " + galaoMenor + " galões de 3,6 litros!");
            System.out.println("O valor é de " + galaoMenor * 25 + " R$");
        } else {
            System.out.println("É necessário comprar galões mistos.");
        }

        input.close();
    }
}
