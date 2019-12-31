
public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1;
		int numero   = 11;
		
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
	}
}
