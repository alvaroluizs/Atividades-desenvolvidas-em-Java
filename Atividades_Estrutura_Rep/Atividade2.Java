import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user ;
        String senha;

        System.out.println("Digite o usuario: ");
        user = input.nextLine();

        System.out.println("Digite a senha: ");
        senha = input.nextLine();


        if (senha.equalsIgnoreCase(user)) {
            do {
                System.out.println("Erro de Segurança! Usuario e Senha Identicos.");

                System.out.println("Digite o usuario ");
                user = input.nextLine();

                System.out.println("Digite a senha: ");
                senha = input.nextLine();

            } while (senha.equalsIgnoreCase(user));

        } System.out.println("Registrado");

    }
}