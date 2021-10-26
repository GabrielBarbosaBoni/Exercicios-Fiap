package twenty;

public class finobacci {

	public static void main(String[] args) {
		
		int ultimo, penultimo, x , finobacci;
		
		ultimo = 1;
		penultimo = 0;
		for(int i=0 ; i<30; i++) {
			ultimo =  ultimo + penultimo;
			penultimo =  ultimo - penultimo;
			System.out.println(ultimo);
			
		}
	}
}
