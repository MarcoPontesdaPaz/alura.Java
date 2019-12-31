
public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente paulo = new Cliente();

		paulo.nome = "Paulo Silveira";
		paulo.cpf = "999.999.999-00";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.depositar(100);

		//System.out.println( contaDoPaulo.titular.cpf);
		
		//contaDoPaulo.titular = paulo;
		//System.out.println(contaDoPaulo.titular.cpf);

	}
}
