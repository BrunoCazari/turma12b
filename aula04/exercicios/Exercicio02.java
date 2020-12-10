package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, valor3, resultado;

        //RECEBE OS VALORES
        System.out.println("Digite o 1º número: ");
        valor1 = teclado.nextInt();
        
        System.out.println("Digite o 2º número: ");
        valor2 = teclado.nextInt();
        
        System.out.println("Digite o 3º número: ");
        valor3 = teclado.nextInt();

        //CHAMA METODO PARA VALIDAR O MENOR E EXIBE O RESULTADO
        resultado = menorNumero(valor1, valor2, valor3);
        System.out.println("O menor valor digitado foi " + resultado);
        teclado.close();
    }

    public static int menorNumero(int valor1, int valor2, int valor3){
        int resposta;
        if ((valor1 <= valor2) && (valor1 <= valor3)){
            resposta = valor1;
        } else if ((valor2 < valor1) && (valor2 <= valor3)){
            resposta = valor2;
        } else {
            resposta = valor3;
        }
        return resposta;
    }
}
