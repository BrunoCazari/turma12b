package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int turma, aluno;
        double mediaTurma, mediaAluno, mediaGeral=0;

        turma = 1;
        
        while (turma <= 5){;
            mediaTurma = 0;
            System.out.printf("Turma %d\n", turma);
            aluno = 1;
            while (aluno <= 20){
                System.out.println("Informe a nota do aluno " + aluno);
                mediaAluno = teclado.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
                aluno ++;
            }
            mediaTurma = mediaTurma / (aluno-1);
            mediaGeral = mediaGeral + mediaTurma;
            System.out.printf("A média da turma %d foi %.2f\n\n", turma, mediaTurma);
            turma ++;
        }
        mediaGeral = mediaGeral / (turma-1);
        System.out.printf("A média geral das turmas foi %.2f\n", mediaGeral);




        teclado.close();
    }
}
