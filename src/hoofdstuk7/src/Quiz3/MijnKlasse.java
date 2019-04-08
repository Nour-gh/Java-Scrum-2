package hoofdstuk7.src.Quiz3;

public class MijnKlasse {

	String strQuote = "We kunnen een probleem niet oplossen met" +
			" de denkwijze die het heeft veroorzaakt. Albert Einstein";
	
	public void mijnMethode()
	{
		//Code voorheen:
		//System.out.println(strQuote.substring(23,27));
		//Dit werd er eerst uitgeschreven: "niet".
		
		//Door de characternummers te veranderen kun je kiezen vanaf welke letter tot welke letter hij moet uitprinten.
		
		System.out.println(strQuote.substring(81,96));
	}
}
