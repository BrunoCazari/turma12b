package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, valor, qtdPos=0, qtdNeg=0, qtdPar=0, qtdImpar=0;

        cont = 0;

        while (cont < 5){
            valor = teclado.nextInt();            
            if (valor > 0){
                qtdPos++;
            }else if (valor < 0){
                qtdNeg++;
            }
            
            if (valor % 2 == 0){
                qtdPar++;
            }else{
                qtdImpar++;
            }
            cont++;
        }

        System.out.println(qtdPar + " valor(es) par(es)");
        System.out.println(qtdImpar + " valor(es) impar(es)");
        System.out.println(qtdPos + " valor(es) positivo(s)");
        System.out.println(qtdNeg + " valor(es) negativo(s)");                 

        teclado.close();
    }
}
