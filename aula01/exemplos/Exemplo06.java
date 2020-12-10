package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        double resultado;

        resultado = 7 / 9;

        System.out.println(resultado);

        resultado = 7.0 / 9;

        System.out.println(resultado);

        double valorDouble = 7;

        resultado = valorDouble / 9;

        System.out.println(resultado);

        int valorInt = 7;

        resultado = (double) valorInt / 9;

        System.out.println(resultado);
    }
}
