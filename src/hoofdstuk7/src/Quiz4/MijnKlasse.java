package Quiz4;

public class MijnKlasse {
	
String str = "He$llo $World$";
String valuables = "$233, $12, $90, $62";
	
	public void mijnMethode()
	{
		System.out.println(str.replace("$",""));
		
		
		//Hier worden alle $ verangen door €. Doordat het teken $ al in de string staat moet je dus $ vervangen.
		//Met de commande *.replace("$", "€") vervang je dus het dollarteken voor het euroteken.	
		System.out.print(valuables.replace("$", "€"));
	}
}
