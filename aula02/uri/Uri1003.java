package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, soma;

        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        soma = valor1 + valor2;
        
        System.out.println("SOMA = " + soma);

        teclado.close();
        
    }
}
