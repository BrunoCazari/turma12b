package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, imposto, isento, faixa1, faixa2;

        salario = teclado.nextDouble();

        isento = 2000;
        faixa1 = 3000;
        faixa2 = 4500;

        if ((salario >= 0) && (salario <= isento)){
            System.out.println("Isento"); 

        } else if (salario <= faixa1){
            imposto = (salario - isento) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);

        } else if (salario <= faixa2){
            imposto = ((faixa1 - isento) * 0.08) + ((salario - faixa1) * 0.18);
            System.out.printf("R$ %.2f\n", imposto);            
        } else {
            imposto = ((faixa1 - isento) * 0.08) + ((faixa2 - faixa1) * 0.18) + ((salario - faixa2) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);            
        } 

        teclado.close();
    }
}
