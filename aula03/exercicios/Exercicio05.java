package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, par=0, impar=0;
        
        for (int cont=1; cont<=10; cont++) {
            System.out.println("Digite o " + cont +"º número:");
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("O total de pares é: " + par); 
        System.out.println("O total de impares é: " + impar);  

        teclado.close();
    }
}
