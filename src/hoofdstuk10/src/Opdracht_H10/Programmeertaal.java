package hoofdstuk10.src.Opdracht_H10;

public class Programmeertaal {

	static int aantalTalen;
	String taal;
	
	public Programmeertaal() {
		aantalTalen ++;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	Programmeertaal st1 = new Programmeertaal();
	Programmeertaal st2 = new Programmeertaal();
	Programmeertaal st3 = new Programmeertaal();
	Programmeertaal st4 = new Programmeertaal();
	Programmeertaal st5 = new Programmeertaal();
	
	String taal = "";
	taal += "Java ";
	taal += "C++ ";
	taal += "Python ";
	taal += "PHP ";
	taal += "Ruby";
	
	System.out.print(taal);
	System.out.println(aantalTalen);
	}
}
