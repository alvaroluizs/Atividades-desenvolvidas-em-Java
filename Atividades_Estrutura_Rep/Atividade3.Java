import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String nome;
        String sexo;
        String estadoS = null;
        int idade;
        double salario;
        int tamanhoNome;
        String estadoS2 = null;

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

        }
        System.out.println("Registrado!");

        System.out.print("Digite seu estado civil (S - Solteiro, C - Casado, V - Vivendo em União Estável, D - Divorciado): ");
        estadoS = scanner.nextLine().toUpperCase();

        while (!estadoS.equals("S") && !estadoS.equals("C") && !estadoS.equals("V") && !estadoS.equals("D")) {

            System.out.print("Estado civil inválido. Digite novamente: ");
            estadoS = scanner.nextLine().toUpperCase();

        } switch (estadoS) {

                case "S":
                    System.out.println("Registrado |Estado Civil Solteiro");
                    break;

                case "C":
                    System.out.println("Registrado | Estado Civil Casado");
                    break;
                case "V":
                    System.out.println("Registrado | Estado Civil Vivendo");
                    break;

                case "D":
                    System.out.println("Registrado | Estado Civil Divorciado");
                    break;
            }
        }


    }