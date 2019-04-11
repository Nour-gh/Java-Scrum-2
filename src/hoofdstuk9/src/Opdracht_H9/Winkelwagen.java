package hoofdstuk9.src.Opdracht_H9;
import java.util.ArrayList;

public class Winkelwagen {
    ArrayList<Artikel> printArtikelen = new ArrayList<Artikel>();

    public void ArtikelToevoegen() {

        Artikel st1 = new Artikel("Overhemd", 20.39);
        Artikel st2 = new Artikel("Broek", 32.85);
        Artikel st3 = new Artikel("Sokken", 11.25);
        Artikel st4 = new Artikel("Jas", 120.65);

        printArtikelen.add(st1);
        printArtikelen.add(st2);
        printArtikelen.add(st3);
        printArtikelen.add(st4);
    }

    public static void main(String[] args) {
        Winkelwagen w1 = new Winkelwagen();
        w1.ArtikelToevoegen();

        for (int i = 0; i < w1.printArtikelen.size(); i++) {

            System.out.println("De prijs van een" + " " + w1.printArtikelen.get(i).naam + " is " + w1.printArtikelen.get(i).prijs + ", " + "euro.");
        }
    }
}