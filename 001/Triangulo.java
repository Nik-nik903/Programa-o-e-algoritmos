import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Digite o valor da base do triângulo");
        base = ler.nextDouble();

        System.out.println("Digete o valor da altura do triângulo");
        altura = ler.nextDouble();
    
        area = (base *altura) / 2;
        System.out.println("A área do triângulo é " + area);





    }

}
