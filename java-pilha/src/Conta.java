
public class Conta {

	public void deposita() throws MinhaException {
		
		System.out.println("deposita !");		
		
		throw new MinhaException("deposita");
	}
}
