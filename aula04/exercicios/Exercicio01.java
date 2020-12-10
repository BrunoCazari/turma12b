package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.print("Digite um número: ");
        valor = teclado.nextInt();
        valida(valor);
        System.out.println(valida2(valor));
        if(valida3(valor)){
            System.out.println("O número digitado é par");
        }else{
            System.out.println("O número digitado é impar");
        }
        teclado.close();
    }

    public static void valida(int numero){
        if (numero % 2 == 0){
            System.out.println("O número digitado é par");
        }else{
            System.out.println("O número digitado é impar");
        }
    }

    public static String valida2(int numero){
        if (numero % 2 == 0){
            return "O número digitado é par";
        } else {
            return "O número digitado é impar";
        }
    }

    public static Boolean valida3(int numero){
        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }    

}
