import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double soma = 0;
        double media = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = entrada.nextDouble();

            soma += numero;
        }

        media = soma / 5;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}