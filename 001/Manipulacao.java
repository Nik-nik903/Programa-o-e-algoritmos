public class Manipulacao {
    public static void main(String[] args) {
         final int n1 = 10; //Constante, acrescenta o modificador final
        int n2 = 20;
        int n3 = 15;
        //Linha com erro, pois o valor de n1 não pode ser alterado
        //n1 = 20
        n2 = 20 + n1;
        int soma = n2 + (n1 - 5);



        System.out.println("Soma é " + soma);

    }
}
