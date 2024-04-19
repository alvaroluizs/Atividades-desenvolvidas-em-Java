package exercicio25;

import java.util.Scanner;

public class exercicio25{ 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        System.out.println("Responda às seguintes perguntas com 'sim' ou 'não':"); 

        System.out.println("Telefonou para a vítima?"); 

        String resposta1 = scanner.next().toLowerCase(); 

        System.out.println("Esteve no local do crime?"); 

        String resposta2 = scanner.next().toLowerCase(); 

        System.out.println("Mora perto da vítima?"); 

        String resposta3 = scanner.next().toLowerCase(); 

        System.out.println("Devia para a vítima?"); 

        String resposta4 = scanner.next().toLowerCase(); 

        System.out.println("Já trabalhou com a vítima?"); 

        String resposta5 = scanner.next().toLowerCase(); 

  

        int contagem = 0; 

  

        if (resposta1.equals("sim")) { 

            contagem++; 

        } 

        if (resposta2.equals("sim")) { 

            contagem++; 

        } 

        if (resposta3.equals("sim")) { 

            contagem++; 

        } 

        if (resposta4.equals("sim")) { 

            contagem++; 

        } 

        if (resposta5.equals("sim")) { 

            contagem++; 

        } 

  

        String classificacao; 

        switch (contagem) { 

            case 2: 

                classificacao = "Suspeita"; 

                break; 

            case 3: 

            case 4: 

                classificacao = "Cúmplice"; 

                break; 

            case 5: 

                classificacao = "Assassino"; 

                break; 

            default: 

                classificacao = "Inocente"; 

        } 

  

        System.out.println("Classificação: " + classificacao); 

  

        scanner.close(); 

    } 

}