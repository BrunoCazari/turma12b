package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorKm, valorMilha, valorJarda, valorPes, valorPolegadas;

        //RECEBE OS DADOS
        
        System.out.println("Informe o quilometro (km): ");
        valorKm = teclado.nextDouble();

        //PROCESSA MEDIDAS
        valorMilha = valorKm * 0.62137;
        valorJarda = valorMilha * 1760;
        valorPes = valorJarda * 3;
        valorPolegadas = valorPes * 12;
        

        //EXIBE O RESULTADO
        System.out.println("O valor em km é " + valorKm);
        System.out.println("O valor em milhas é " + valorMilha);
        System.out.println("O valor em jardas é " + valorJarda);
        System.out.println("O valor em pés é " + valorPes);
        System.out.println("O valor em polegadas é " + valorPolegadas);

        teclado.close();
    }
}
