package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        linha(25);
        System.out.println("Sistema de controle");
        linha2(20, '_');
        System.out.println("v1.0");
        linha2(10, '*');
    }

    public static void linha(int tamanho){

        for (int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void linha2(int tamanho, char tipo){

        for (int i = 0; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }    
}
