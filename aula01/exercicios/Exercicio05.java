package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoFabrica, valorDistrib, valorImposto, valorFinal;

        //RECEBE OS DADOS
        
        System.out.println("Informe o custo de fábrica do veículo (R$): ");
        custoFabrica = teclado.nextDouble();

        //PROCESSA O VALOR DO VEÍCULO
        valorDistrib = custoFabrica * 0.28;
        valorImposto = custoFabrica * 0.45;

        valorFinal = custoFabrica + valorDistrib + valorImposto;

        //EXIBE O RESULTADO
        System.out.printf("O valor final do veículo é R$ %.2f\n\n", valorFinal);
        System.out.printf("O valor do imposto a ser pago é de R$ %.2f\n\n", valorImposto);

        teclado.close();
    }
}
