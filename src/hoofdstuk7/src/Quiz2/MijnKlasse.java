package hoofdstuk7.src.Quiz2;

public class MijnKlasse {

	
	String str1 = "Noah";
	String str2 = new String("Noah");
	
	
	public void mijnMethode()
	{
		if(str1 == str2)
		{
			System.out.println("X");
		}
		if(str1.equals(str2))
		{
			System.out.println("Y");
		}
		else
		{
			System.out.println("Z");
		}
		//Hier wordt gecontrolleerd of str1 gelijk is aan str2, dus of alles in str1 precies hetzelfde is als in str2.
		System.out.println(str1.equals(str2));
		}
	}
