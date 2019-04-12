package hoofdstuk9.src.Quiz1;

public class MijnArray {

	public static void main(String[] args) {
		
		int[] arrayInt = new int[11];
		//Als je het statement int [ ] arrayInt = new int [3] ; vervangt door het statement int [ ] arrayInt = new int [11] ; 
		//wordt er dan deze code geschreven naar de standaarduitvoer.
		
		for (int i = 0; i < arrayInt.length; i++ ) {
			
			System.out.print(arrayInt[i] + " ");
		}
	}
}
