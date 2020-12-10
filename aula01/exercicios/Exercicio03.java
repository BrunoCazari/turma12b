package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salário do colaborador (R$): ");
        salario = teclado.nextDouble();

        salario = salario * 1.25;

        System.out.println("O novo salário do colaborador é R$" + salario);

        teclado.close();
    }
}
