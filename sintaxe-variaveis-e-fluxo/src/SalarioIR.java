
public class SalarioIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double salario = 50000.0;
		double aliquota;
		double abatimento;
		
		if (salario < 1900) {
			
			aliquota = 0.0;
			abatimento = 0.0;
		} 
		else if (salario <= 2800.00) {
			
			aliquota = 7.5;
			abatimento = 142.0;
			
		} else if (salario <= 3751.0) {

			aliquota = 15.0;
			abatimento = 350.0;

		} else {

			aliquota = 22.5;
			abatimento = 636.0;

		}
		
		System.out.println("Aliquota   == " + aliquota);
		System.out.println("Abatimento == " + abatimento);
	}

}
