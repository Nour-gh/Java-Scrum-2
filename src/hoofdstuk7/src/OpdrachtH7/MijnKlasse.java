package hoofdstuk7.src.OpdrachtH7;

public class MijnKlasse {

    String tekst = "Brazilië$ is een$ groot$ lan$d in Zuid$-Amerika.";

    //Hele tekst in hoofdletters
    public void hoofdletters() {
        System.out.println("1. Hele tekst in hoofdletters: " + tekst.toUpperCase( ) );
    }
    //hele tekst in kleine letters
    public void kleineletters() {
        System.out.println("2. Hele tekst in kleine letters: " + tekst.toLowerCase( ) );
    }
    //het aantal tekens in de tekst
    public void aantalTekens() {
        int length = tekst.length( );
        System.out.println("3. Het aantal tekens van de tekst: " + length);
    }
    //verwijder alle dollartekens
    public void verwijderDollartekens() {
        System.out.println("4. Verwijder alle dollartekens uit de tekst: " + tekst.replace("$", ""));
    }
    //de tekst zonder de eerste 10 tekens
    public void verwijderEerste10() {
        System.out.println("5. De tekst zonder de eerste 10 tekens: " + tekst.substring(10,48));
    }
    //de index van het laatste dollarteken
    public void indexLaatsteDollarteken() {
        System.out.println("6. De index van het laatste dollarteken: " + tekst.indexOf("$"));
    }
    //vervang het woord brazilië door het woord argentinië
    public void BrazilieArgentinie() {
        System.out.print("7. Vervang het woord Brazilië door Argentinië: ");
        System.out.println(tekst.replace("Brazilië","Argentinië"));
    }
    }