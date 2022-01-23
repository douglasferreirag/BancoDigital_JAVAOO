
public class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;

	protected int agencia;
	
	protected int numero;
	
	protected double saldo = 0.0;
	
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		
			this.agencia =  Conta.AGENCIA_PADRAO;
			
			this.numero = SEQUENCIAL++;
			
			this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
		saldo -= valor;
		
	}


	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
		saldo+= valor;
		
	}


	@Override
	public void transferir(Conta contaSaida , Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		
		//this.sacar(valor);
		
		//contaDestino.depositar(valor);
		
		contaSaida.sacar(valor);
		
		contaDestino.depositar(valor);
		
	}
	
	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		
		System.out.println(String.format("Numero: %d", this.numero));
		
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
		
		
		
		
	}
	
	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	

	


	
	
	
	

}
