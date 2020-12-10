package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, valor3, media;

        valor1 = teclado.nextDouble();
        valor2 = teclado.nextDouble();
        valor3 = teclado.nextDouble();

        valor1 = valor1 * 2;
        valor2 = valor2 * 3;
        valor3 = valor3 * 5;

        media = (valor1 + valor2 + valor3) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();
        
    }
}
