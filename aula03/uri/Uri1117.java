package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        double nota = 0, media = 0;

        
        while (cont < 2){
            nota = teclado.nextDouble(); 
            if ((nota < 0) || (nota > 10)){
                System.out.println("nota invalida");
            }else{
                media = media + nota;
                cont++;
            }          
        }

        media = media / cont;
        System.out.printf("media = %.2f\n", media);

        teclado.close();
    }
}
