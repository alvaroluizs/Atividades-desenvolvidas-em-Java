import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double valorM = 0;
        double valorMen = 0;
        System.out.println("Informe Número 1 ");
        numero1 = input.nextDouble();

        System.out.println("Informe Número 2 ");
        numero2 = input.nextDouble();

        System.out.println("Informe Número 3 ");
        numero3 = input.nextDouble();


        if (numero1 > numero2) {
            valorM = numero1;
        } else if (numero2 > numero3) {

            valorM = numero2;
        } else if (numero3 > numero1) {
            valorM = numero3;
        }
        if (valorM == 0) {
            System.out.println("Valores Crescentes iguais ");
        } else {
            System.out.println("Valor Maior" + valorM);
        }
      if (numero1 < numero2) {
        valorMen = numero1;
    } else if (numero2 > numero3) {
          valorMen = numero2;
      }else if (numero3 > numero1) {
              valorMen = numero3;
          }

          if (valorMen == 0) {
              System.out.println("Valores Decrescentes iguais ");
          } else {
              System.out.println("Valor Menor" + valorMen);
          }
      }
}
