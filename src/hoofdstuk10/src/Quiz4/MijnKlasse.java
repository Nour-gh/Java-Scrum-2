package hoofdstuk10.src.Quiz4;

public class MijnKlasse {

	  static int x = 2;
	  MijnKlasse()
	  {
	    x ++;
	    //als je += 4 naar ++ veranderd, gaat het antwoord van 11 naar 5.
	  }
	  static void methodeA(int i)
	  {
	    x = x - i;
	  }
	  int methodeB(int i)
	  {
	    return x + i;
	  }
	
}
