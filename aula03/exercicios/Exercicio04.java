package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, valor, soma;

        soma = 0;
        cont = 1;
        valor = 1;

        while (valor != 0){
            System.out.println("Digite o " + cont +"º número:");
            valor = teclado.nextInt();
            soma = soma + valor;
            cont ++;
        }

        System.out.print("A soma dos valores é: " + soma);  

        teclado.close();
    }
    
}
