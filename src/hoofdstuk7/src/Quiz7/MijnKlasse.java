package hoofdstuk7.src.Quiz7;

public class MijnKlasse {

StringBuffer sb = new StringBuffer("Hij is vriend.");
	
	public void mijnMethode() {
		//Hier wordt er een woord na de 7e character ingevoerd.
		sb.insert(7, "mijn ");
		System.out.print(sb);
	}
}
