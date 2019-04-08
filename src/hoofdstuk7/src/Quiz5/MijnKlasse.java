package hoofdstuk7.src.Quiz5;

public class MijnKlasse {

String mijnStr = " de aarde is 4,6 miljard jaar oud ";
String mijnStr2 = "Alles wat we zijn is het resultaat van wat we dachten. Boeddha";
String mijnStr3 = "Logica brengt je van A naar B, verbeelding brengt je overal. Albert Einstein";
String mijnStr4 = "Voorkomen is beter dan genezen.";

	public void mijnMethode() {
		
		int strLenght = mijnStr.length();
		int strLenght1 = mijnStr2.length();
		int strLenght2 = mijnStr3.length();
		int strLenght3 = mijnStr4.length();
		
		
		mijnStr = mijnStr.toUpperCase();
		mijnStr = mijnStr.trim();
		
		//als mijnStr groter dan of gelijk is aan 40 characters print dan de zin uit.
		if(mijnStr.length() <= 40) {
			System.out.println(mijnStr + " (" + "Hele Zin " + strLenght + " Characters)");
		}
		else {
			//als de zin dus groter is dan 40 characters print hij alleen de eerste 40 characters uit.
			System.out.println(mijnStr.substring(0,40) + " " + strLenght);
		}
		
		//hier herhaalt hij het voor mijnStr2 (de tweede zin)
		if(mijnStr2.length() <= 40) {
			System.out.println(mijnStr2);
		}
		else {
			System.out.println(mijnStr2.substring(0,40) + " (" + "Hele Zin " + strLenght1 + " Characters)");
		}
	     
		//hier herhaalt hij het voor mijnStr3 (de derde zin)
		if(mijnStr3.length() <= 40) {
			System.out.println(mijnStr3 + " " + strLenght1);
		}
		else {
			System.out.println(mijnStr3.substring(0,40) + " (" + "Hele Zin " + strLenght2 + " Characters)");
		}
		
		//hier herhaalt hij het voor mijnStr4 (de vierde zin)
		if(mijnStr4.length() <= 40) {
			System.out.println(mijnStr4 + " (" + "Hele Zin " + strLenght3 + " Characters)");
		}
		else {
			System.out.println(mijnStr4.substring(0,40));
		}
		System.out.println("");
		System.out.println("Elke zin heeft nu 40 Characters.");
	}
}
