package banco_digital;

public class ContaCorrente extends Conta {
	
	Cliente client = new Cliente();
	@Override
	public void impressaoExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		client.setNome("Valdomiro");
		System.out.println(client.getNome());
		super.imprimirInfosComuns();
	}
	
	
	
	
	

}
