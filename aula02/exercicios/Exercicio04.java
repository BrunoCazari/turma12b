package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        int valorPrestacao;
    
        //RECEBE OS DADOS
        System.out.println("Digite o valor do salário do funcionario");
        salario = teclado.nextDouble();
    
        System.out.println("Digite o valor da prestação");
        valorPrestacao = teclado.nextInt();
            
        //EXIBE RESULTADO
        if (valorPrestacao <= (salario * 0.3)){
            System.out.println("Empréstimo aprovado");      
        } 
        else {
            System.out.println("Empréstimo negado pois valor da prestação ultrapassa 30% do salário"); 
        }
    
        teclado.close();
    }
}
