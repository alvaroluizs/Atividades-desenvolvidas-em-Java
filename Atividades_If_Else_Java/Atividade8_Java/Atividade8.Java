import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double produto1;
        double produto2;
        double produto3;
        double produtoMB = 0;

        System.out.println(" Informe o Valor do Produto: ");
        produto1 = input.nextDouble();

        System.out.println(" Informe o Valor do Produto: ");
        produto2 = input.nextDouble();

        System.out.println(" Informe o Valor do Produto: ");
        produto3 = input.nextDouble();


        if (produto1 < produto3) {
            produtoMB = produto1;
        } else if (produto2 < produto3) {
            produtoMB = produto2;
        } else if (produto3 < produto1) {
            produtoMB = produto3;
        } else {
            System.out.println("Todos produtos contem o mesmo Valor de : " + produto1);
        return;
        }
            System.out.println("O produto a com o melhor custo tem o custo de " + produtoMB);
        }
    }
