import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double valorA = 0;
                double salarioBase = 0;
                double salarioNovo = 0;
                String porcentagem = "";
                System.out.println("Salario Base");

                salarioBase = input.nextDouble();

                if ((salarioBase < 280)) {
                    salarioNovo = salarioBase * 1.20;
                    porcentagem = "20%";

                } else if ((salarioBase >= 280) && (salarioBase <= 700)) {
                    salarioNovo = salarioBase * 1.15;
                    porcentagem = "15%";

                } else if ((salarioBase > 700) && (salarioBase <= 1500)) {
                    salarioNovo = salarioBase * 1.10;
                    porcentagem = "10%";
                } else if (salarioBase > 1500) {
                    salarioNovo = salarioBase * 1.5;
                    porcentagem = "5%";
                }
                valorA = salarioNovo - salarioBase;


                System.out.println("Salário antes do reajuste " + salarioBase) ;
                System.out.println("Percentual de Aumento aplicado " + porcentagem);
                System.out.printf("Valor Aumentado : %.2f%n" , valorA );
                System.out.printf("Novo Salário : %.2f%n" , salarioNovo );

            }

        }