import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double km,consumo,total;

        System.out.println(" Quantos KM você irá viagar ? ");
        km = ler.nextDouble();

        System.out.println(" Qual é o consumo de combustível do carro ? ");
        consumo = ler.nextDouble();

        total = km / consumo;

        System.out.println(" Para fazer sua viagem de " + km + " KM " + " você irám consumir " + total + " de combustível");
    }
    
}
