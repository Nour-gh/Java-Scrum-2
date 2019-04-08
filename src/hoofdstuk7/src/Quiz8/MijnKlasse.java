package Quiz8;

public class MijnKlasse {

	StringBuffer sb = new StringBuffer("Hij was haar vriend.");
	
	public void mijnMethode() {
		sb.replace(8, 12, "je");
		//Door .replace(8, 12, "") worden de letters tussen de twee integers vervangen door het gene tussen "".
		System.out.print(sb);
	}
}