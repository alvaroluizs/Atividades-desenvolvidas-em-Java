import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;


        System.out.println("Digite Número : ");
        numero1 = input.nextInt();


        if (numero1 > -1)
        {
            System.out.println("O valor: " + numero1 + " e positivo");

        } else  {
            System.out.println("O valor: " + numero1 + " e negativo");
        }




    }
}