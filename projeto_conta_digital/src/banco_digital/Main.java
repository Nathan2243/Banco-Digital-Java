package banco_digital;


public class Main {
	public static void main(String[] args) {

		ContaCorrente corrente = new ContaCorrente();
		corrente.depositar(100);
		ContaPoupanca poupanca = new ContaPoupanca();
		corrente.transferir(100, poupanca);
		
		corrente.impressaoExtrato();
		poupanca.impressaoExtrato();
	}

}
