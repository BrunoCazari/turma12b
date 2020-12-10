package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;

        System.out.println("Digite sua senha:");
        senha = teclado.nextLine();

        if (senha.equals("R10p5")){
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado");
        }

        teclado.close();
    }
}
