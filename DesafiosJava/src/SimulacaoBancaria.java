import java.util.Scanner;

public class SimulacaoBancaria {

    /**
     * @author Danilo Terashima
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double valordeposito = scanner.nextDouble();
                    saldo = saldo + valordeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    double valorsaque = scanner.nextDouble();
                    if (saldo > valorsaque) {
                        saldo = saldo - valorsaque;
                        System.out.println("Saldo atual: " + saldo);}
                        else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    // Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}