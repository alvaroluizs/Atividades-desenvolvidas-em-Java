import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorH;
        double horaT;
        double SalarioBruto = 0;
        double IR = 0;
        double INSS = 0;
        double FGTS;
        double Totaldescontos;
        double SalárioLiquido;


        System.out.println("Valor da Hora Trabalhada: ");
        valorH = input.nextDouble();

        System.out.println("Quantidade de Horas Trabalhadas Mês: ");
        horaT = input.nextDouble();

        SalarioBruto = horaT * valorH;

        if ((SalarioBruto < 900)) {
            System.out.println("Salário Bruto Isento : " + SalarioBruto);

        } else if ((SalarioBruto >= 900) && (SalarioBruto <= 1500)) {

            IR = (SalarioBruto * 0.05);
            INSS = (SalarioBruto * 0.1);
            FGTS = (SalarioBruto * 0.11);


            System.out.println("Salário Bruto: " + SalarioBruto);
            System.out.println("IR (-5%): " + IR);
            System.out.println("INSS  (-10%): " + INSS);
            System.out.println(" FGTS (-11%) : " + FGTS);
            System.out.printf("Total de Descontos FORA FGTS : %.2f ", (IR + INSS));
            System.out.printf("Salário Liquido : %.2f ", (SalarioBruto - (IR + INSS)));

        } else if ((SalarioBruto >= 1500) && (SalarioBruto < 2500))
        {

            IR = (SalarioBruto * 0.1);
            INSS = (SalarioBruto * 0.1);
            FGTS = (SalarioBruto * 0.11);

            System.out.println("Salário Bruto: " + SalarioBruto);
            System.out.println("IR (-10%): " + IR);
            System.out.println("INSS  (-10%): " + INSS);
            System.out.println(" FGTS (-11%) : " + FGTS);
            System.out.printf("Total de Descontos FORA FGTS : %.2f ", (IR + INSS));
            System.out.printf("Salário Liquido : %.2f ", (SalarioBruto - (IR + INSS)));

        }   else if (SalarioBruto >= 2500) {

            IR = (SalarioBruto * 0.2);
            INSS = (SalarioBruto * 0.1);
            FGTS = (SalarioBruto * 0.11);

            System.out.println("Salário Bruto: " + SalarioBruto);
            System.out.println("IR (-20%): " + IR);
            System.out.println("INSS  (-10%): " + INSS);
            System.out.println(" FGTS (-11%) : " + FGTS);
            System.out.printf("Total de Descontos FORA FGTS : %.2f ", (IR + INSS));
            System.out.printf("Salário Liquido : %.2f ", (SalarioBruto - (IR + INSS)));

        }
    }
}
