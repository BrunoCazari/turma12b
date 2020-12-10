package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, qtdNotas;

        valor = teclado.nextInt();
      
        System.out.println(valor);

        qtdNotas = valor / 100;
        valor = valor % 100;
        System.out.println(qtdNotas + " nota(s) de R$ 100,00");

        qtdNotas = valor / 50;
        valor = valor % 50;
        System.out.println(qtdNotas + " nota(s) de R$ 50,00");

        qtdNotas = valor / 20;
        valor = valor % 20;
        System.out.println(qtdNotas + " nota(s) de R$ 20,00");

        qtdNotas = valor / 10;
        valor = valor % 10;
        System.out.println(qtdNotas + " nota(s) de R$ 10,00");

        qtdNotas = valor / 5;
        valor = valor % 5;
        System.out.println(qtdNotas + " nota(s) de R$ 5,00");        

        qtdNotas = valor / 2;
        valor = valor % 2;
        System.out.println(qtdNotas + " nota(s) de R$ 2,00");       
        
        qtdNotas = valor / 1;
        valor = valor % 1;
        System.out.println(qtdNotas + " nota(s) de R$ 1,00");        


        teclado.close();
    }    
}
