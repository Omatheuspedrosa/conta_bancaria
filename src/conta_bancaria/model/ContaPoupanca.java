package conta_bancaria.model;

public class ContaPoupanca extends Conta {
	
	private int diaAniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int diaAniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.diaAniversario);
	}
	
	

}
