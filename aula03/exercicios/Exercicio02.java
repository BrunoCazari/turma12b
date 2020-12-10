package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, cont, resultado;

        System.out.println("Digite um número");
        valor = teclado.nextInt();

        cont = 0;

        while (cont < 11){
            resultado = valor * cont;
            System.out.println(valor + " x " + cont + " = " + resultado);            
            cont++;
        }

        teclado.close();
    }
}
