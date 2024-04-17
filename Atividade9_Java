import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double numeroMa = 0;
        double numeroMen = 0;
        double numeroM = 0;

        System.out.println(" Informe o Valor do Produto: ");
        numero1 = input.nextDouble();

        System.out.println(" Informe o Valor do Produto: ");
        numero2 = input.nextDouble();

        System.out.println(" Informe o Valor do Produto: ");
        numero3 = input.nextDouble();


        if (numero1 > numero3 && numero1 > numero2) {
            numeroMa = numero1;
        } else if (numero2 > numero3 && numero2 > numero1) {
            numeroMa = numero2;
        } else {
            numeroMa = numero3;
        }
        if (numero1 < numero3 && numero1 < numero2) {
            numeroMen = numero1;

        } else if (numero2 < numero3 && numero2 < numero1) {
            numeroMen = numero2;
        } else {
            numeroMen = numero3;

        }
        numeroM = numero1 + numero2 + numero3 - (numeroMa + numeroMen);


        System.out.println(numeroMa);
        System.out.println(numeroM);
        System.out.println(numeroMen);

    }
}