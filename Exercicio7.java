import java.util.Scanner;
import java.lang.Math;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Revestimento");
        System.out.println("---------------------------");

        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        double larguraCeramica = scanner.nextDouble();

        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        double comprimentoCeramica = scanner.nextDouble();

        System.out.print("Digite o valor por metro quadrado da cerâmica escolhida: ");
        double valorPorMetroQuadrado = scanner.nextDouble();

        // Calcula a quantidade de cerâmica necessária
        double areaTotal = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        double quantidadeCeramica = Math.ceil((areaTotal * 1.1) / areaCeramica);

        // Calcula o valor total
        double valorTotal = quantidadeCeramica * areaCeramica * valorPorMetroQuadrado;

        System.out.println("\nQuantidade de revestimento necessária: " + quantidadeCeramica + " unidades");
        System.out.println("Valor total a ser pago: R$" + valorTotal);

        scanner.close();
    }
}