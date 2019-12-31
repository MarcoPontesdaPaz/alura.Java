
public class TestaGet_e_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getNome());

	}
}
