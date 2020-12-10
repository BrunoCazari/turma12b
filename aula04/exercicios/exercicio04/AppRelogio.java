package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio horario = new Relogio(10,9,12);

        horario.setHora(1);
        System.out.println("Agora são " + horario.getHora() + " hora(s)");
        horario.exibir();
    }    
}
