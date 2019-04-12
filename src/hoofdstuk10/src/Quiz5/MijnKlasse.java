package hoofdstuk10.src.Quiz5;

public class MijnKlasse {

		int x;
		//door de static weg te halen veranderd de uitkomst van 369 naar 333.
		StringBuffer sb = new StringBuffer();
		//static hier weghalen veranderd de uitkomst van 333 naar 3.
		public MijnKlasse()
		{
			mijnMethode();
		}
		public void mijnMethode()
		{
			x += 3;
			sb.append(x);
		}
	
}
