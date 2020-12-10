package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();

        // nome == "Emerson" -> não usar
        // nome.equals("Emerson")

        if (nome.equalsIgnoreCase("Emerson")){
            System.out.println("Olá Emerson");
        }else{
            System.out.println("Você não é o Emerson");
        }

        teclado.close();
    }
}
