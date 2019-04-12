package hoofdstuk9.src.Quiz5;
import java.util.Arrays;

public class MijnArray {

	public static void main(String[] args) {
		char[] arrCharA = new char[4];
		arrCharA[0] = 'w';
		arrCharA[1] = 'k';
		arrCharA[2] = 'd';
		arrCharA[3] = 'r';
		
		char[] arrayChar = new char[8];
		arrayChar[0] = 'R';
		arrayChar[1] = 'N';
		arrayChar[2] = 'B';
		arrayChar[3] = 'S';
		arrayChar[4] = 'M';
		arrayChar[5] = 'O';
		arrayChar[6] = 'A';
		arrayChar[7] = 'C';
		
		printCharArray(arrayChar);
		printCharArray(arrCharA);
		
		boolean c = Arrays.equals(arrayChar, arrCharA);
		System.out.println(c + " ");
		Arrays.sort(arrayChar);
		printCharArray(arrayChar);
	}
	
	public static void printCharArray(char[] array) {
		for(int t = 0; t < array.length; t++) {
			System.out.print(array[t] + " ");
		}
		System.out.println();
	}
}

//1.	We hebben een andere array van char met de naam arrayChar declareren.
//2.	We hebben de elementen R, N, B, S, M, O, A en C toegevoegd aan de arrayChar.
//3.	Met Arrays.sort(arrayChar) kunnen we de elementen alfabetisch sorteren. 
//4.	Met boolean c = Arrays.equals(arrayChar, arrCharA) kunnen we controleren of twee arrays gelijk zijn.
//5.	Tenslotte wordt de elementen van de arrayChar naar de standaarduitvoer geschreven. 
