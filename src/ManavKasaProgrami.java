/**
 * @author Nurlan
 */

/* Manav Kasa Programı
 
Fiyatlar:

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 
 */

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamTutar;
		double armutKq, elmaKq, domatesKq, muzKq, patlicanKq;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Kaç kilo armut aldınız: ");
		armutKq = input.nextDouble();
		System.out.print("Kaç kilo elma aldınız: ");
		elmaKq = input.nextDouble();
		System.out.print("Kaç kilo domates aldınız: ");
		domatesKq = input.nextDouble();
		System.out.print("Kaç kilo muz aldınız: ");
		muzKq = input.nextDouble();
		System.out.print("Kaç kilo patlıcan aldınız: ");
		patlicanKq = input.nextDouble();
		
		armut *= armutKq;	
		elma *= elmaKq;
		domates *= domatesKq;
		muz *= muzKq;
		patlican *= patlicanKq;
		
		
		toplamTutar = armut + elma + domates + muz + patlican;
		System.out.println("Toplam tutar: " + toplamTutar + "TL");

	}

}
