package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        double nota;

        System.out.println("Informe a nota do estudante: ");
        Scanner teclado = new Scanner(System.in);


        nota = teclado.nextDouble();

        if (nota > 6){
            System.out.println("Aluno aprovado");
        }

        teclado.close();
    }
}
