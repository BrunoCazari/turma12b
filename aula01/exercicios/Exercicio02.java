package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double P1, P2, nota;

        System.out.println("Digite a nota da P1:");
        P1 = teclado.nextDouble();

        System.out.println("Digite a nota da P2:");
        P2 = teclado.nextDouble();

        nota = (P1 + P2) / 2;

        System.out.println("A nota final do anuno é  " + nota);

        teclado.close();
    }
}
