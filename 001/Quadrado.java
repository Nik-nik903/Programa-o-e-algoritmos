import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado, area;
System.out.println("Digite o valor do lado do quadrado");
lado = ler.nextInt();

area = lado * lado;
System.out.println("A área do quadrado é " + area);



    }
    
}
