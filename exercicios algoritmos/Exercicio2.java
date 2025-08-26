import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int chocolate;
        double valor, total;
        String nome;
        System.out.println( " Qual é seu nome ? ");
        nome = ler.next();




        System.out.println(" Quantos chocolate você comprou ? ");
chocolate = ler.nextInt();

System.out.println(" Qual é o valor da unidade ? ");
valor = ler.nextDouble();


total = chocolate * valor;
System.out.println(" Olá " + nome + " você comprou. " + chocolate + " O valor total ficou R$" + total);






    }
    
}
