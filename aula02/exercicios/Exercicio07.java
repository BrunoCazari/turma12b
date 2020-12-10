package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, desconto;

        System.out.println("Informe o valor do salário:");
        salario = teclado.nextDouble();

        if (salario <= 600){
            System.out.printf("Para um salário de R$ %.2f, não há desconto de INSS\n", salario);
        }else if (salario <= 1200){
            desconto = salario * 0.2;
            System.out.printf("Para um salário de R$ %.2f, O desconto do INSS é de 20%%: R$ %.2f\n", salario, desconto);
        }else if (salario <= 2000){
            desconto = salario * 0.25;
            System.out.printf("Para um salário de R$ %.2f, O desconto do INSS é de 25%%: R$ %.2f\n", salario, desconto);
        }else{
            desconto = salario * 0.3;
            System.out.printf("Para um salário de R$ %.2f, O desconto do INSS é de 30%%: R$ %.2f\n", salario, desconto);
        }

        teclado.close();
    }
}
