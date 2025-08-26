import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int alunos, paes, consumo;

        System.out.println(" Quantos alunos estão na sala de aula?" );
        alunos = ler.nextInt();

        System.out.println(" Quantos pães foram comprados para a merenda?");
        paes = ler.nextInt();

        consumo = paes - alunos;

        System.out.println(" Cada aluno irá comer 1 pão e vai sobra " + consumo + " de pães ");



    
    }
}
