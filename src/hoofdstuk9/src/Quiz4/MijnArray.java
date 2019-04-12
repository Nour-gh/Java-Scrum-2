package hoofdstuk9.src.Quiz4;
import java.util.Arrays;

public class MijnArray {
	
public static void main(String[] args) {
	char[] arrCharA = new char[4];
	arrCharA[0] = 'g';
	arrCharA[1] = 'h';
	arrCharA[2] = 'e';
	arrCharA[3] = 'f';
	
	int[] arrayInt = new int[5];
	arrayInt[0] = 3;
	arrayInt[1] = 4;
	arrayInt[2] = 2;
	arrayInt[3] = 7;
	arrayInt[4] = 9;
	
	char[] arrCharB = Arrays.copyOf(arrCharA, arrCharA.length);
	Arrays.sort(arrCharA);
	
	System.out.print(arrCharA[2]);
	System.out.println(arrCharB[3]);
	
	for(int i = 0; i < arrayInt.length; i++) {
		System.out.println(arrayInt[i] + " is element op positie " + i);
		}
	}
}

//1.	Declareer een nieuwe array van integer met de naam arrayInt.
//2.	Voeg de elementen 3, 4, 2, 7 en 9 toe aan de arrayInt.
//3.	Voeg een code aan de klasse MijnArray toe om de elementwaarden van arrayInt te schrijven naar de standaarduitvoer. 
