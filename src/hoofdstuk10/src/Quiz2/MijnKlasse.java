// Nour Gurah

package hoofdstuk10.src.Quiz2;

public class MijnKlasse {

	static int x = 3;
	
	public MijnKlasse() {
		x++;
		resetX();
	}
	
	public static int mijnMethode(int i, int i2) {
		x += (i = i2);
		return x;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MijnKlasse mk1 = new MijnKlasse();
		MijnKlasse mk2 = new MijnKlasse();
		System.out.print(MijnKlasse.x + ", ");
		MijnKlasse mk3 = new MijnKlasse();
		MijnKlasse.mijnMethode(8, 3);
		System.out.print(MijnKlasse.x);
	}
	
	private static void resetX() {
		x= 0;
		x= 10;
		x= 100;
		
		System.out.println(MijnKlasse.x);
	}
}
