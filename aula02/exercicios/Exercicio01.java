package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1;
        double resultado;

        valor1 = teclado.nextInt();

        if (valor1 < 20){
            resultado = (double) valor1 / 2;
            System.out.println(resultado);
        }

        teclado.close();
    }    
}
