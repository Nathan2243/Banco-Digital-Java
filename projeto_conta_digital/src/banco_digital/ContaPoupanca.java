package banco_digital;


public class ContaPoupanca extends Conta {

	@Override
	public void impressaoExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	
	

}
