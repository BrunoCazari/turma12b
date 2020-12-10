package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Fusca", "Volkswagen", 13.5);
        v1.dadosVeiculo();
        System.out.println("O consumo é de " + v1.dadosConsumo() + " km/l");
    }
}
