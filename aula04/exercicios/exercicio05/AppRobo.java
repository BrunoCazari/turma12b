package exercicios.exercicio05;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int direcao = 0;

        Robo move = new Robo(0,0);

        while (direcao != 5){
            System.out.println("Informe a direção:");
            System.out.println("1 = Norte");
            System.out.println("2 = Sul");
            System.out.println("3 = Oeste");
            System.out.println("4 = Leste");
            System.out.println("5 = SAIR");            
            direcao = teclado.nextInt();
            if ((direcao == 1) || (direcao == 2) || (direcao == 3) || (direcao == 4)){
                move.setMovimento(direcao);
                System.out.printf("Robô movimentado\n\n");
            }else if (direcao == 5){
                move.getPosicao();
            }else {
                System.out.printf("O valor informado não é válido!\n\n");
            }
            move.getPosicao();    
        }
        teclado.close();        
    }
}
