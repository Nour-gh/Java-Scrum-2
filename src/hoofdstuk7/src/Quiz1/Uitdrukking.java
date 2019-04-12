package hoofdstuk7.src.Quiz1;

public class Uitdrukking {

	String strSpreekwoord = "De aanval is de beste verdediging.";
	//Nieuwe toegevoegde string.
	String mijnStr = "Angst is een slechte raadgever."; 
	
	public void mijnMethode()
	{
		//Hier neemt hij de 5e letter van de String strSpreekwoord.
		//Daarna zoek hij de index van de letters "d" en "i".
		System.out.print(strSpreekwoord.charAt(5));
		System.out.print(", " + strSpreekwoord.indexOf("d"));
		System.out.print(", " + strSpreekwoord.indexOf("i"));
		
		//Hier neemt hij de 5e letter van de String mijnStr.
		//Daarna zoek hij de index van de letter "h".
		System.out.print(mijnStr.charAt(7));
		System.out.print(", " + mijnStr.indexOf("h"));
	}
}
