
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Segue o Extrato Conta Poupança");
		super.imprimirInfosComuns();
	}
}