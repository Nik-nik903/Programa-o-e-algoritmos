import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double C,F;

         System.out.println(" Quanto graus Celsius você quer converter para fahrenheit?");
         C = ler.nextDouble();

         F = C * 9/5 + 32;

         System.out.println(+ C + " Celsius em Fahreheit é " + F  );
    }
}
