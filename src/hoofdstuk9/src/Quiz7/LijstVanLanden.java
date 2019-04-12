package hoofdstuk9.src.Quiz7;

import java.util.ArrayList;

public class LijstVanLanden {

	public static void main(String[] args) {
		
		java.util.ArrayList<String> landen = new ArrayList<String>();
		
		landen.add("Duitsland");
		landen.add("Verenigde Staten");
		landen.add("Rusland");
		landen.add("Verenigd Koninkrijk");
		landen.add(2, "India");
		landen.remove(0);
		
		for (int i = 0; i < landen.size(); i++ ) {
			System.out.print(landen.get(i) + " ");
		}
		printInfo(landen);
	}
	
	public static void printInfo(java.util.ArrayList<String> lijst) {
		System.out.println();
		
		System.out.println("ArrayList landen leeg is?" + " " + lijst.isEmpty());
		
		System.out.println("Controleert of Spanje in de Arraylist staat:" + " " + lijst.contains("Spanje"));
		
		System.out.println("Controleert of India in de Arraylist staat:" + " " + lijst.contains("India"));
		
		System.out.println("Dit is de index van Rusland: " + lijst.indexOf("Rusland"));
		
		System.out.println("Dit is de index van hele landen: " + lijst.size());
	}
}

//1.	Controleer of de ArrayList landen leeg is?   Dat doe je met isEmpty() methode.
//2.	Controleer of Spanje in de ArrayList staat? Dat doe je met contains(“Spanje”) methode.
//3.	Controleer of India in de ArrayList staat?    Dat do je met contains(“India”) methode.
//4.	Vind de index van Rusland in de ArrayList? Dat doe je met indexof(“Rusland”) methode.
//5.	Vind het aantal landen dat in de ArrayList landen staat? Dat doe je met lijst.size() methode.
//6.	Verwijder Duitsland uit de ArrayList landen? Dat doe je met landen.remove(0).
