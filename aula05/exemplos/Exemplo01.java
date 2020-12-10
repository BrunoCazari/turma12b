package exemplos;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(15);
        lista.add(8);
        lista.add(50);

        System.out.println(lista);
        System.out.println("Quantidade de itens: " + lista.size());

        for (int i=0; i < lista.size(); i++){
            if (lista.get(i) == 8) {
                System.out.println("Achei na posição " + i);
            }
        }

        for (Integer item : lista){ // para cada 'item' Integer da 'lista' faça
            if(item == 8){
                System.out.println("Achei");
            }
        }

        System.out.println("Removendo o primeiro item: " + lista.remove(0));
        System.out.println(lista);
    }
    
}