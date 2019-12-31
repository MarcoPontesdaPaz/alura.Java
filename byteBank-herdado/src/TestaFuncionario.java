
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		
		nico.setNome ("Nico Steppat");
		nico.setCpf("123.456.789-00");
		nico.setSalario(2800.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());

	}
}
