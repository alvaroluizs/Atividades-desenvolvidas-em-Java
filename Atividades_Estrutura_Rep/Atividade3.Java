import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String sexo;
        String estadoS;
        int idade;
        double salario;
        int tamanhoNome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        tamanhoNome = nome.length();

        if (tamanhoNome < 4) {
            do {
                System.out.println("Erro: O nome deve ter pelo menos 3 caracteres.");

                System.out.print("Digite seu nome: ");
                nome = input.nextLine();
                tamanhoNome = nome.length();
            } while (tamanhoNome < 4);

        }
        System.out.println("Registrado!");

        System.out.print("Digite sua Idade: ");
        idade = input.nextInt();

        if (idade > 150) {

            do {
                System.out.println("ERRO !Digite uma Idade Valida!");

                System.out.print("Digite novamenta sua idade: ");
                idade = input.nextInt();


            } while (idade > 150);

        }
        System.out.println("Registrado!");

        System.out.print("Digite seu Salário: ");
        salario = input.nextInt();

        if (salario < 0) {

            do {
                System.out.println("ERRO !Digite um Salário Valido");

                System.out.print("Digite novamenta seu Salário: ");
                salario = input.nextDouble();

            } while (salario < 0);

        } else {
            System.out.println("Registrado!");
        }


        System.out.print("Digite o Sexo: ");
        sexo = input.next();

        if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
            do {
                System.out.println("ERRO |Sexo Invalido|.");

                System.out.print("Digite sexo novamente: ");
                sexo = input.nextLine();

            } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));

        } System.out.println("Registrado!");

        System.out.println("Estado Civil: S - SOLTEIRO | C - CASADO | V - VIVENDO | D - DIVORCIADO ");
        estadoS = input.nextLine();
        if (!estadoS.equalsIgnoreCase("S") | !estadoS.equalsIgnoreCase("C") |
                estadoS.equalsIgnoreCase("V") | estadoS.equalsIgnoreCase("D")) {

        do {
            System.out.println("ERRO |Estado Civil Incorreto|.");
            System.out.print("Digite seu Estado Civil novamente: ");
            estadoS = input.nextLine();
        } while ((!estadoS.equalsIgnoreCase("S") | !estadoS.equalsIgnoreCase("C") |
                estadoS.equalsIgnoreCase("V") | estadoS.equalsIgnoreCase("D")));
        }
        System.out.println("Registrado!");
    }
}

