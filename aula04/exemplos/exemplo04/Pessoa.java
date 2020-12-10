package exemplos.exemplo04;

public class Pessoa {
    //atributo
    String nome;

    //método construtor
    Pessoa(String nome){
        this.nome = nome; // 'this' se refere ao próprio objeto
    }

    //método
    void apresentar(){
        System.out.println("Olá! Sou " + nome);
    }
}
