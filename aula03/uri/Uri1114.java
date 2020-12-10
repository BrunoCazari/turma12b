package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha = 0, valor = 0;

        senha = 2002;
        while (valor != senha){
            valor = teclado.nextInt(); 
            if (valor != senha){
                System.out.println("Senha Invalida");
            }else{
                System.out.println("Acesso Permitido");
            }          

        }

        teclado.close();
    }
}
