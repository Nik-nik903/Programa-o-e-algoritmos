import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

double saldoinicial, saque, saldo, saldofinal;
System.out.println("Quanto de dinheiro você tem no banco");
saldoinicial = ler.nextDouble();

System.out.println("Quanto de dinheiro você quer sacar");
saque = ler.nextDouble();

saldofinal = saldoinicial - saque;

System.out.println( "Você tinha" + saldoinicial + " Sacou " + saque + " e ficou com " + saldofinal);




    }
}