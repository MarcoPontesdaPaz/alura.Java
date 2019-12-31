
public class TestaSomatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int total = 0;
		
		while (contador <= 10) {
			
			//total = total + contador;
			total += contador;
			
			contador ++;
			
			System.out.println(total);
		}
		
		System.out.println("final == " + total);

	}

}
