package exercicio20;

import java.util.Scanner; 

public class exercicio20 { 

   public static void main(String[] args) { 

       Scanner scanner = new Scanner(System.in); 

       System.out.println("Digite a primeira nota: "); 

       double nota1 = scanner.nextDouble(); 

 

       System.out.println("Digite a segunda nota: "); 

       double nota2 = scanner.nextDouble(); 

 

       System.out.println("Digite a terceira nota: "); 

       double nota3 = scanner.nextDouble(); 

 

       double media = (nota1 + nota2 + nota3) / 3; 

 

       System.out.println("Média: " + media); 

 

       if (media >= 10) { 

           System.out.println("Aprovado com distinção"); 

       } else if (media >= 7) { 

           System.out.println("Aprovado"); 

       } else { 

           System.out.println("Reprovado"); 

       } 

        scanner.close(); 

   } 

}