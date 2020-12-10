package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int resultado;
        
        resultado = soma(10,6);
        System.out.println("Soma = " + resultado);
    }

    public static int soma(int valor1, int valor2){
        int resposta;

        resposta = valor1 + valor2;

        return resposta;
    }
}
