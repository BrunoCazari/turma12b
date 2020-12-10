package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, soma, cont;

        cont = 1; //contador
        soma = 0; //acumulador ou somador
        while(cont < 6){
            System.out.println("Digite o valor");
            valor = teclado.nextInt();
            soma = soma + valor;
            cont++;
        }

        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
