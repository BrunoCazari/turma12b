package exercicios;

import java.util.Scanner;

public class Exercicio02 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota1, nota2, notaFinal;

    //RECEBE OS DADOS
    System.out.println("Digite o valor da primeira nota");
    nota1 = teclado.nextDouble();

    System.out.println("Digite o valor da segunda nota");
    nota2 = teclado.nextDouble();

    //CALCULA NOTA
        nota1 = nota1 * 0.4;
        nota2 = nota2 * 0.6;
        notaFinal = nota1 + nota2;

    //EXIBE RESULTADO
    if (notaFinal >= 6){
        System.out.println("Aprovado");
    } 
    else {
        System.out.println("Reprovado");
    }

    teclado.close();
 }   
}
