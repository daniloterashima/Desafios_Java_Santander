
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Segue o Extrato Conta Corrente");
		super.imprimirInfosComuns();
	}
	
}