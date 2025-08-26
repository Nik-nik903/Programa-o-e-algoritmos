import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade,idadefinal;
        
        System.out.println(" Qual é o seu nome ? ");
        nome = ler.next();

        System.out.println(" Qual a sua idade atual ? ");
        idade = ler. nextInt();
idadefinal = idade + 10;
System.out.println("Olá " + nome + " hoje você tem " + idade + " e daqui a 10 anos terá " + idadefinal );
        
        
    }
}
