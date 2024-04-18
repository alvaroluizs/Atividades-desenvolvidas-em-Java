import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1;
        int nota2;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota1 = input.nextInt();

        if (nota1 >10) {
        do {
            System.out.println("Valor Invalido");

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota1 = input.nextInt();


        } while (nota1 > 10);

    } System.out.println("Valor Valido");

 }
}