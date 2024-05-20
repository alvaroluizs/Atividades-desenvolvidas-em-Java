import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
       
        while (true) {
          
            System.out.print("Digite o número para gerar a tabuada (ou 0 para sair): ");
            int numero = entrada.nextInt();

           
            if (numero == 0) {
                break;
            }

           
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido! Digite um número entre 1 e 10.");
                continue;
            }
           
            System.out.println("\nTabuada de " + numero + ":\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        System.out.println("Programa finalizado!");
    }
}