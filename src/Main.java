
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli = new Cliente();
		
		cli.setNome("Douglas");
		
		Conta cc = new ContaCorrente(cli);
		
		cc.depositar(100);
		
		cc.imprimirExtrato();
		
		Conta poupanca = new ContaPoupanca(cli);
		
		System.out.println();
		
		System.out.println();
		
		System.out.println();
		
		poupanca.imprimirExtrato();
		
		cc.transferir(cc, poupanca, 50);
		
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();

	}

}
