package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ladoA, ladoB, ladoC;
        
        //RECEBE OS DADOS
        System.out.println("Informe o comprimento do lado A do triângulo:");
        ladoA = teclado.nextDouble();

        System.out.println("Informe o comprimento do lado B do triângulo:");
        ladoB = teclado.nextDouble();

        System.out.println("Informe o comprimento do lado C do triângulo:");
        ladoC = teclado.nextDouble();
        
        //DEFINE E MOSTRA O RESULTADO
        if ((ladoA > (ladoB + ladoC)) || (ladoB > (ladoA + ladoC)) || (ladoC > (ladoA + ladoB))){
            System.out.printf("Os valores A=%.2f, B=%.2f e C=%.2f não formam um triângulo\n", ladoA, ladoB, ladoC);
        }else if ((ladoA == ladoB) && (ladoB == ladoC)){
            System.out.printf("Os valores A=%.2f, B=%.2f e C=%.2f formam um triângulo equilátero\n", ladoA, ladoB, ladoC);
        }else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){
            System.out.printf("Os valores A=%.2f, B=%.2f e C=%.2f formam um triângulo isósceles\n", ladoA, ladoB, ladoC);
        }else{
            System.out.printf("Os valores A=%.2f, B=%.2f e C=%.2f formam um triângulo escaleno\n", ladoA, ladoB, ladoC);
        }

        teclado.close();
    }
}
