package exemplos.exemplo04;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Diego");
        Pessoa p2 = new Pessoa("Théo");

        //p1.nome = "Diego";
        p1.apresentar();

        //p2.nome = "Théo";
        p2.apresentar();
    }
}
