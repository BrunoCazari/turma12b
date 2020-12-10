package exercicios.exercicio05;

public class Robo {
    private int coordX, coordY;

    public Robo(int coordX, int coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void setMovimento(int direcao){
        if ((direcao == 1) && (this.coordY < 6)){
            coordY = coordY + 1;
        }
        if ((direcao == 2) && (this.coordY > -6)){
            coordY = coordY - 1;
        }
        if ((direcao == 3) && (this.coordX > -6)){
            coordX = coordX - 1;
        }
        if ((direcao == 4) && (this.coordX < 6)){
            coordX = coordX + 1;
        }

    }

    public void getPosicao(){
        System.out.printf("O robô encontra-se nas coordenadas x=%d e y=%d\n\n", coordX, coordY);
    }     


}
