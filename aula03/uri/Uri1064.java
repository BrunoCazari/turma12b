package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, qtdPositivo=0;
        double valor, somaPositivo=0;

        cont = 0;

        while (cont < 6){
            valor = teclado.nextDouble();            
            if (valor > 0){
                qtdPositivo++;
                somaPositivo = somaPositivo + valor;
            }        
            cont++;
        }

        System.out.println(qtdPositivo + " valores positivos");
        System.out.printf("%.1f\n", (double)(somaPositivo / qtdPositivo));

        teclado.close();
    }
}
