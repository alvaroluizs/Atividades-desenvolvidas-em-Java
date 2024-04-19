package exercicio24;
import java.util.Scanner; 
public class exercicio24 { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        System.out.println("Digite o primeiro número: "); 

        double num1 = scanner.nextDouble(); 

  

        System.out.println("Digite o segundo número: "); 

        double num2 = scanner.nextDouble(); 

  

        System.out.println("Escolha a operação desejada:"); 

        System.out.println("1 - Soma"); 

        System.out.println("2 - Subtração"); 

        System.out.println("3 - Multiplicação"); 

        System.out.println("4 - Divisão"); 

        int opcao = scanner.nextInt(); 

  

        double resultado = 0; 

  

        switch (opcao) { 

            case 1: 

                resultado = num1 + num2; 

                break; 

            case 2: 

                resultado = num1 - num2; 

                break; 

            case 3: 

                resultado = num1 * num2; 

                break; 

            case 4: 

                resultado = num1 / num2; 

                break; 

            default: 

                System.out.println("Opção inválida."); 

        } 

  

        String parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar"; 

        String positivoOuNegativo = (resultado >= 0) ? "positivo" : "negativo"; 

        String inteiroOuDecimal = (resultado == Math.round(resultado)) ? "inteiro" : "decimal"; 

  

        System.out.println("Resultado: " + resultado); 

        System.out.println("O resultado é " + parOuImpar + ", " + positivoOuNegativo + " e " + inteiroOuDecimal + "."); 

  

        scanner.close(); 

    } 

}