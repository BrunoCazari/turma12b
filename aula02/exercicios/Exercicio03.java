package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2;
    
        //RECEBE OS DADOS
        System.out.println("Digite o primeiro valor");
        valor1 = teclado.nextDouble();
    
        System.out.println("Digite o segundo valor");
        valor2 = teclado.nextDouble();
    
        //EXIBE RESULTADO
        if (valor2 > valor1){
            System.out.println(valor2);
            System.out.println(valor1);            
        } 
        else {
            System.out.println(valor1);
            System.out.println(valor2); 
        }
    
        teclado.close();
    }
}
