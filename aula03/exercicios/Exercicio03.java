package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, cont;

        System.out.println("Digite um número");
        valor = teclado.nextInt();

        cont = 1;

        while (cont <= valor){
            if (cont == 1){
                System.out.print(cont);                  
            } else {
                System.out.print(", " + cont); 
            }           
            cont = cont * 2;
        }

        teclado.close();
    }
}
