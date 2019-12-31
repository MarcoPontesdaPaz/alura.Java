
public class Conta {
	
	private double 	saldo;
	private	int		agencia;
	private	int		numero;
	private	Cliente	titular = new Cliente();
	
	private static int totalContas = 0; 
	
	public Conta () {
		
		totalContas++;

	}
	
	public Conta (int agencia, 
				  int numero,
				  Cliente titular) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
		
		System.out.println(this.getAgencia());
		System.out.println(this.getNumero());
		System.out.println(this.getTitular().getNome());
		System.out.println(this.getTitular().getCpf());
		System.out.println(this.getTitular().getProfissao());
		
		Conta.totalContas ++;

		System.out.println(Conta.totalContas);
	}
	
	public static int getTotalContas () {
		return Conta.totalContas;
	}
	
	public boolean depositar (double valorDeposito)  {
		
		if (valorDeposito < 0) {
			return false;
		} else {
		
			this.saldo += valorDeposito;
			return true;
		}
	}
	
	public boolean sacar (double valorSaque) {
		
		if (this.saldo >= valorSaque) {
			
			this.saldo -= valorSaque;
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean transferir (Conta contaFavorecida, double valorTransferencia) {
	
		if (this.saldo < valorTransferencia) {								// verifica se tem saldo

			return false;

		} else if (! this.sacar(valorTransferencia)) {						// saque a conta cedente ( this )

			return false;

		} else if (! contaFavorecida.depositar(valorTransferencia)) {		// faz o deposito na conta favorecida
			
			return false;
			
		} else {
			return true;
		}
	}
	
	public double getSaldo () {
		return this.saldo;
	}

	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero (int numero) {
		
		if (numero <= 0) {
			//
		} else {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			//
		} else {
			this.agencia = agencia;
		}
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}