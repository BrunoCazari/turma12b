package exemplos;

import java.util.TreeSet;

public class Exemplo02 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        arvore.add(10);
        arvore.add(15);
        arvore.add(8);
        arvore.add(70);
        arvore.add(15);

        System.out.println(arvore);
    }
}
