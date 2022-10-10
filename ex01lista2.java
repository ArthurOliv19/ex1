import java.util.Scanner;

public class ex01lista2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b;
        System.out.println(" Digite o primeiro número ");
        a = teclado.nextDouble();
        System.out.println(" Digite o segundo número ");
        b = teclado.nextDouble();
        teclado.close();

        if (b > a) {
            System.out.println( " o maior é o número  " + b);

        } else {
            System.out.println( " o maior é  o número " + a);
        }

    }
}
