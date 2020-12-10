package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double desconto, razaoSalario, salario, consumo, quilowattValor, conta, contaDesc;

        //RECEBE OS DADOS
        desconto = 0.15;
        razaoSalario = 0.002;

        System.out.println("Informe o valor do salário mínimo (R$): ");
        salario = teclado.nextDouble();

        System.out.println("Informe a quantidade de quilowatts (kW) consumida: ");
        consumo = teclado.nextDouble();  
        
        //PROCESSA A CONTA
        quilowattValor = salario * razaoSalario;
        conta = consumo * quilowattValor;
        contaDesc = conta - (conta * desconto);

        //EXIBE O RESULTADO
        System.out.println("O valor do quilowatt é R$" + quilowattValor);
        System.out.println("O valor da conta de energia da residência é R$" + conta);
        System.out.println("O valor da conta de energia da residência com 15% de desconto é R$" + contaDesc);

        teclado.close();
    }
}
