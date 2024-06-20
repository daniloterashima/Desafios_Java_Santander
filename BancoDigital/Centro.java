
public class Centro {

	public static void main(String[] args) {
		Cliente danilo = new Cliente();
		danilo.setNome("Terashima");
		
		Conta cc = new ContaCorrente(danilo);
		Conta poupanca = new ContaPoupanca(danilo);

		cc.depositar(1000);
		cc.transferir(400, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}