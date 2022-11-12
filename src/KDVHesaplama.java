/**
 * @author Nurlan
 */

/* KDV Hesaplama Programi

https://app.patika.dev/nurlanz */

import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		
		Scanner fiyat = new Scanner (System.in);
		
		float kdvsizFiyat, kdvOrani1 = 0.18f, kdvOrani2 = 0.08f; //Degişkenler
		
		System.out.print("Urunun KDV'siz fiyatını giriniz :"); //Kullanıcıdan ürünün fiyat bilgisi
		kdvsizFiyat = fiyat.nextFloat();
		
		//KDV Tutari hesaplama
		float kdvTutari = (kdvsizFiyat >= 0 && kdvsizFiyat <= 1000) ? (kdvsizFiyat*kdvOrani1) : (kdvsizFiyat*kdvOrani2); 
		
		//KDV'li fiyat hesaplama
		float kdvliFiyat = kdvTutari + kdvsizFiyat;
		
		//Ürünün KDV'siz fiyatini, KDV oranini, KDV tutarini, KDV'li fiyatini ekrana yazdirma
		System.out.println("Urunun KDV'siz fiyati :" + kdvsizFiyat);
		String kdvOrani3  = (kdvsizFiyat >= 0 && kdvsizFiyat <= 1000) ? "KDV Orani - 18%" : "KDV Orani - 8%";
		System.out.println(kdvOrani3);
		System.out.println("KDV Tutari :" + kdvTutari );
		System.out.println("Urunun KDV'li fiyati :" + kdvliFiyat);
		

	}

}
