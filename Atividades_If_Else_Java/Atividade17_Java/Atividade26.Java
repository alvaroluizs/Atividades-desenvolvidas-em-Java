package exercicio26;
import java.util.Scanner; 
public class exercicio26{ 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        System.out.println("Digite o tipo de combustível (A - Álcool, G - Gasolina): "); 

        char tipoCombustivel = scanner.next().charAt(0); 

  

        System.out.println("Digite a quantidade de litros vendidos: "); 

        double litrosVendidos = scanner.nextDouble(); 

  

        double precoAlcool = 1.90; 

        double precoGasolina = 2.50; 

        double desconto = 0; 

        double valorTotal = 0; 

  

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') { 

            if (litrosVendidos <= 20) { 

                desconto = 0.03; 

            } else { 

                desconto = 0.05; 

            } 

            valorTotal = litrosVendidos * precoAlcool * (1 - desconto); 

        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') { 

            if (litrosVendidos <= 20) { 

                desconto = 0.04; 

            } else { 

                desconto = 0.06; 

            } 

            valorTotal = litrosVendidos * precoGasolina * (1 - desconto); 

        } else { 

            System.out.println("Tipo de combustível inválido."); 

            System.exit(0); 

        } 

  

        System.out.println("Valor a ser pago: R$ " + valorTotal); 

  

        scanner.close(); 

    } 

}