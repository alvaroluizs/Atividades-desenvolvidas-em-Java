import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int paisA = 80000;
        int paisB = 200000;
        double txA = 0.03;
        double txB = 0.015;
        int ano = 0;


        while (paisA  <= paisB) {

            paisA *= (1 + txA);
            paisB *= (1 + txB);
            ano++;
        }
        System.out.print("Foram necessarios " + ano  +  "anos para que a população do Pais A igualase ao Pais B");
    }
}