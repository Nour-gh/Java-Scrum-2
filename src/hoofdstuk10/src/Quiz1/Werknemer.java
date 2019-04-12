// Nour Gurah

package hoofdstuk10.src.Quiz1;

public class Werknemer {

	int nr; // instantievariablere
	static int stNr; // klassenvariabele
	public Werknemer() {
		
		nr++;
		stNr++;
	}
	public static void main(String[] args) {
		Werknemer wn1 = new Werknemer();
		Werknemer wn2 = new Werknemer();
		Werknemer wn3 = new Werknemer();
		// het maken van twee objecten wn4 en wn5.
		Werknemer wn4 = new Werknemer();
		Werknemer wn5 = new Werknemer();
		
		
		System.out.print(Werknemer.stNr + ", ");
		System.out.print(wn1.nr + ", ");
		System.out.print(wn2.nr + ", ");
		System.out.print(wn3.nr + ", ");
		System.out.print(wn4.nr + ", ");
		System.out.print(wn5.nr);
	}
}
