
public class Conta {
	
	private double 	saldo;
	private	int		agencia;
	private	int		numero;
	//Cliente	titular;
	private	Cliente	titular = new Cliente();
	
	public boolean depositar (double valorDeposito)  {
		
		this.saldo += valorDeposito;

		return true;
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
	
}