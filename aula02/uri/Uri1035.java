package uri;

import java.util.Scanner;

public class Uri1035 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorA, valorB, valorC, valorD, soma1, soma2;

        valorA = teclado.nextInt();
        valorB = teclado.nextInt();
        valorC = teclado.nextInt();
        valorD = teclado.nextInt();

        soma1 = valorA + valorB;
        soma2 = valorC + valorD;

        if ((valorA % 2 == 0) && (valorC > 0) && (valorD > 0) && (valorB > valorC) && (valorA < valorD) && (soma2 > soma1)){
            System.out.println("Valores aceitos");
        } else {
                System.out.println("Valores nao aceitos");
        }


        teclado.close();
    }
}