
public class TestaConversao {
	
	public static void main (String[] args) {
		
		double salario = 1270.50;
		int valor = (int)salario;
		
		System.out.println("Salário == " + salario);
		System.out.println("Valor   == " + (double)valor);
		
		//	boolean		 1 bit
		//	byte		 8 bits		1 byte
		//	short		16 bits		2 bytes
		//	char		16 bits		2 bytes
		//	int 		32 bits		4 bytes
		//	float		32 bits		4 bytes
		//	long		64 bits		8 bytes
		//	double		64 bits		8 bytes
		long numeroGigante	= 45345345345345l;		//	"l" confirma que é long
		
		double numero1 = 0.2;
		double numero2 = 0.1;
		double total   = numero1 + numero2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;				// "f" confirma que é float
		System.out.println(pontoFlutuante);
	}
}
