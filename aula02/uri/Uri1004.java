package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, prod;

        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        prod = valor1 * valor2;
        
        System.out.println("PROD = " + prod);

        teclado.close();
        
    }
}
