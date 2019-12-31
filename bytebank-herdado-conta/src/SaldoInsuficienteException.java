
//public class SaldoInsuficienteException extends RuntimeException{
public class SaldoInsuficienteException extends Exception{

	SaldoInsuficienteException () {
		super();
	}
	
	SaldoInsuficienteException (String s) {
		super(s);
	}	
}
