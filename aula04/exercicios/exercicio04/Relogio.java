package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    //CONSTRUTOR
    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int novaHora){
        if (novaHora >= 0 && novaHora <= 23){
            hora = novaHora;
        }        
    }

    public void setMinuto(int novaMinuto){
        if (novaMinuto >= 0 && novaMinuto < 60){
            minuto = novaMinuto;
        }        
    }  
    
    public void setSegundo(int novaSegundo){
        if (novaSegundo >= 0 && novaSegundo < 60){
            segundo = novaSegundo;
        }        
    }     

    public int getHora(){
        return hora;    
    }    

    public void exibir(){
        System.out.printf("%02d : %02d : %02d\n", hora, minuto, segundo);
    } 
}
