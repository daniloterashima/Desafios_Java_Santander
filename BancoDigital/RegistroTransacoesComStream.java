import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();
        
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);

            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            if (transacao.getTipo()== 'D' || transacao.getTipo()=='d') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo()=='s') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
        //feito a formatacao
                .filter(transacao -> transacao.getTipo()=='d' ||transacao.getTipo()=='D'|| transacao.getTipo()=='s'||transacao.getTipo()== 'S' )
                .map(t -> t.getTipo() + " de "+ t.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
//incluido a classe de transacao -- avaliar novamente
class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}