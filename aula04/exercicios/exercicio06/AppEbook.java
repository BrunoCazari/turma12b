package exercicios.exercicio06;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, pagina;

        Ebook livro = new Ebook("A arte da Guerra", "Sun Tzu", 142, 1);

        while (opcao != 6){
            System.out.println("--------------------------");
            System.out.println("Selecione a opção:");
            System.out.println("1 = Mostrar capa");
            System.out.println("2 = Avançar página");
            System.out.println("3 = Retroceder página");
            System.out.println("4 = Ir para página");
            System.out.println("5 = Exbir página"); 
            System.out.println("6 = SAIR");
            System.out.println("--------------------------");

            opcao = teclado.nextInt();
            if (opcao == 1){
                livro.mostrarCapa();
            }
            if (opcao == 2){
                livro.avancarPagina();
            }
            if (opcao == 3){
                livro.retrocederPagina();
            }
            if (opcao == 4){
                System.out.println("Informe a página:");
                pagina = teclado.nextInt();
                livro.irParaPagina(pagina);
            }
            if (opcao == 5){
                System.out.println("Você está na página: " + livro.exibirPagina());
            }                                                
        }
        teclado.close();
    }


}
