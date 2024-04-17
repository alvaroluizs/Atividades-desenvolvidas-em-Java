import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;


        System.out.println("Digite lado 1");
        lado1 = input.nextDouble();

        System.out.println("Digite lado 2");
        lado2 = input.nextDouble();

        System.out.println("Digite lado 3");
        lado3 = input.nextDouble();


        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo Equilatero");

        } else if (lado1 == lado2 | lado1 == lado3 | lado2 == lado3)
        {
            System.out.println("Triângulo Isóceles");

        } else if (lado1 < 0 | lado2 < 0 | lado3 < 0) {
            System.out.println("Valor Invalido");


        } else {

            System.out.println("Triângulo Escaleno");
        }

        }

    }