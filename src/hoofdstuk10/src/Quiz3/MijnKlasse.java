package hoofdstuk10.src.Quiz3;

public class MijnKlasse {

	  static int x = 6;
	  int y = 3;
	  MijnKlasse()
	  {
	    x += 3;
	    y += 2;
	  }
	  void mijnMethode(int i)
	  {
	    this.y = y - i;
	    x++;
	  }	
}
v
//de klassenvariabele x word niet beïnvloed.