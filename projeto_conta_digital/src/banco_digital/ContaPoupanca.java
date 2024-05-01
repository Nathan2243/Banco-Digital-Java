package banco_digital;


public class ContaPoupanca extends Conta {
	
	Cliente client = new Cliente();

	@Override
	public void impressaoExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		client.setNome("Nathan");
		System.out.println(client.getNome());
		super.imprimirInfosComuns();
	}

	
	

}
