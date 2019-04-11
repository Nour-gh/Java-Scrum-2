package hoofdstuk9.src.Quiz3;

import java.util.Arrays;

public class Dier_Opdr1 {

	public static void main(String[] args) {
		
		String[] arrDier = new String[5];
		arrDier[0] = "Wolf";
		arrDier[1] = "Leeuw";
		arrDier[2] = "Luipaard";
		arrDier[3] = "Olifant";
		arrDier[4] = "Tijger";
		arrDier[5] = "Beer";
		arrDier[6] = "Zebra";
		arrDier[7] = "Aap";
		
		Arrays.sort(arrDier);
		for(int i = 0; i < arrDier.length; i++) {
			if (i> 1) {
				System.out.print(arrDier[i]);
			}
		}
	}
}

//1.	Als je nog drie dieren toevoegt aan de array arrDier_ Beer, Zebra en Aap op de indexpositie 5, 6 en 7.
//2.	Als je het programma compileert, krijg je de foutmelding
