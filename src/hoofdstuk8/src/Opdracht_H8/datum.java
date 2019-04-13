package hoofdstuk8.src.Opdracht_H8;

public class datum {
	  int studentMonth;
	  int studentYear;
	  int studentDay;
	  String studentName;

	  public datum(int day ,int month, int year, String name) {
		studentDay = day;
		studentMonth = month;
	    studentYear = year;
	    studentName = name;
	  }

	  public static void main(String[] args) {
	    datum myStudent1 = new datum(28, 8, 1998, "Emma");
	    System.out.println("Naam: " + myStudent1.studentName);
	    System.out.println("Geboortedatum: " + myStudent1.studentDay+ - + myStudent1.studentMonth+ - +myStudent1.studentYear);
	    
	    datum myStudent2 = new datum(13, 9, 1996, "David");
	    System.out.println("Naam: " + myStudent2.studentName);
	    System.out.println("Geboortedatum: " + myStudent2.studentDay+ - + myStudent2.studentMonth+ - +myStudent2.studentYear);
	  }
	}

