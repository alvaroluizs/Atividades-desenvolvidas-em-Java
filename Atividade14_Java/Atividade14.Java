import java.net.StandardSocketOptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Nota1;
        double Nota2;
        double media;

        System.out.println("Digite Nota1 : ");
        Nota1 = input.nextDouble();

        System.out.println("Digite Nota2 : ");
        Nota2 = input.nextDouble();

        media = ((Nota1 + Nota2) / 2);

        if (media >= 9 && media <= 10) {
            System.out.println("Media : " + media);
            System.out.println(" Conceito A ");
            System.out.println("Aprovado : ");

        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Media : " + media);
            System.out.println(" Conceito B ");
            System.out.println("Aprovado ! ");

        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Media : " + media);
            System.out.println(" Conceito C ");
            System.out.println("Aprovado ! ");

        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Media : " + media);
            System.out.println(" Conceito D ");
            System.out.println("Reprovado ! ");

        } else if (media >= 0 && media < 4.0) {
            System.out.println("Media : " + media);
            System.out.println(" Conceito D ");
            System.out.println("Reprovado ! ");

        } else {
            System.out.println("Valor Invalido");
        }
    }
}