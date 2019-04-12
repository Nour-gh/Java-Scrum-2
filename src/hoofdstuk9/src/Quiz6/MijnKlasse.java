package hoofdstuk9.src.Quiz6;

public class MijnKlasse {

	void myMethod() {
		String strArray[] = { "n", "b", "a", "z" };
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals("z")) {
				System.out.print("x1 ");
			}
			else if (strArray[i].equals("a")) {
				System.out.print("x2 ");
			}
			else if (strArray[i].equals("b")) {
				System.out.print("x2 ");
			}
			else {
				System.out.print("x3 ");
			}
		}
	}
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		mk.myMethod();
	}
}

//Als je het statement else if (strArray[i].equals(“B”)) vervangt door het statement else if (strArray[i].equals(“b”)) dan wordt zo naar de standaarduitvoer schrijven.