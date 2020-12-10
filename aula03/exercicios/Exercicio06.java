package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, somaPar=0, qtdPar=0, qtdImpar=0;
    
        for (int cont=1; cont<=10; cont++) {
            System.out.println("Digite o " + cont +"º número:");
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                somaPar = somaPar + valor;
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }

    System.out.printf("O média dos valores pares é: %.2f\n", (double) somaPar/qtdPar); 
    System.out.printf("A porcentagem de números impares digitados é: %.2f\n", ((double) qtdImpar * 100 / (double) (qtdPar + qtdImpar)));  

    teclado.close();
    }
    
}
