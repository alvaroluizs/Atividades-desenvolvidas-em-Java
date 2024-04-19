package exercicio23;
import java.util.Scanner; 
public class exercicio23{ 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        System.out.println("Digite um número: "); 

        double numero = scanner.nextDouble(); 

  

        if (numero == Math.round(numero)) { 

            System.out.println("O número " + numero + " é inteiro."); 

        } else { 

            System.out.println("O número " + numero + " é decimal."); 

        } 

  

        scanner.close(); 

    } 

}