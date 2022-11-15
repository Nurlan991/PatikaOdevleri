/**
 * @author Nurlan
 */

/*Vücut Kitle indeksi programı

formul = kilo/boy*boy

https://app.patika.dev/nurlanz */


import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		
		float boy, kilo, index;
		
		Scanner girdi = new Scanner (System.in);
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = girdi.nextFloat();
		System.out.print("Lütfen boyunuzu giriniz: ");
		boy = girdi.nextFloat();
		
		index = kilo / (boy*boy);
		
		System.out.print("Sizin vücut kitle indeksiniz: " + index);
	}

}
