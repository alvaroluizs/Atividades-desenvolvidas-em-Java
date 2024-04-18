import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome ;
        String sexo;
        String estadoS;
        int idade;
        int salario;
        int tamanhoNome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        tamanhoNome = nome.length();

        if (tamanhoNome < 4) {
            while (tamanhoNome < 4){
            System.out.println("Erro: O nome deve ter pelo menos 3 caracteres.");
            System.out.print("Digite seu nome: ");
                nome = input.nextLine();

            }
            System.out.println("Nome válido: " + nome);
        }


        System.out.println("Digite sua Idade: ");
        idade = input.nextInt();

        if (idade > 150) {

            do {
                System.out.println("ERRO !Digite uma Idade Valida!");

                System.out.println("Digite novamenta sua idade: ");
                nome = input.nextLine();


            } while (idade > 150);

        } else {
            System.out.println("Registrado!");
        }


        System.out.println("Digite seu Salário ");
        salario = input.nextInt();

        if (salario <0) {

            do {
                System.out.println("ERRO !Digite um Salário Valido");

                System.out.println("Digite novamenta seu Salário: ");
                salario = input.nextInt();

            } while (salario < 0);

        } else {
            System.out.println("Registrado!");
        }


        System.out.println("Digite o Sexo: ");
        sexo = input.next();

        if (sexo != "F" && sexo != "F") {
            do {
                System.out.println("ERRO |Sexo Invalido|.");

                System.out.println("Digite sexo novamente: ");
                nome = input.nextLine();

            } while (sexo != "f" && sexo != "m");

        } else {
            System.out.println("Registrado!");
        }


        System.out.println("Estado Civil: S - SOLTEIRO | C - CASADO | V - VIVENDO | D - DIVORCIADO ");
        estadoS = input.nextLine();


        }
    }