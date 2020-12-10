package exercicios.exercicio03;

public class Veiculo {
    //atributo
    String modelo, marca;
    Double consumo;

    //método construtor
    Veiculo(String modelo, String marca, Double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    //método
    void dadosVeiculo(){
        System.out.println("O veículo informado " + modelo + " da marca " + marca);
    }
    double dadosConsumo(){
       return consumo;
    }    
}
