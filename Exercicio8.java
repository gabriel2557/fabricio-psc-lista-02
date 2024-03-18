import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Tempo de Download");
        System.out.println("--------------------------------");

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Informe a velocidade do link de download em Mbps: ");
        double velocidadeLinkMbps = scanner.nextDouble();

        // Calcula o tempo necessário para download em segundos
        double tamanhoArquivoMb = tamanhoArquivoMB * 8; // convertendo MB para Mb (1 byte = 8 bits)
        double tempoDownloadSegundos = tamanhoArquivoMb / velocidadeLinkMbps;

        // Converte o tempo para minutos
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;

        System.out.println("\nTempo necessário para download: " + tempoDownloadMinutos + " minutos");

        scanner.close();
    }
}
