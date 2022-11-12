/**
 * @author Nurlan
 */

/* KDV Hesaplama Programi

https://app.patika.dev/nurlanz */

import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		
		Scanner fiyat = new Scanner (System.in);
		
		//Degişkenler
		float kdvsizFiyat, kdvliFiyat, kdvOrani1 = 0.18f, kdvOrani2 = 0.08f, kdvTutari; 
		
		//Kullanıcıdan ürünün fiyat bilgisi
		System.out.print("Urunun KDV'siz fiyatını giriniz :"); 
		kdvsizFiyat = fiyat.nextFloat();
		
		//KDV Tutari hesaplama
		kdvTutari = (kdvsizFiyat >= 0 && kdvsizFiyat <= 1000) ? (kdvsizFiyat*kdvOrani1) : (kdvsizFiyat*kdvOrani2); 
		
		//KDV'li fiyat hesaplama
		kdvliFiyat = kdvTutari + kdvsizFiyat;
		
		//KDV'nin hangi oranla hesaplanmasini belirtmek icin
		String kdvOrani3  = (kdvsizFiyat >= 0 && kdvsizFiyat <= 1000) ? "KDV Orani - 18%" : "KDV Orani - 8%";
		
		//Ürünün KDV'siz fiyatini, KDV oranini, KDV tutarini, KDV'li fiyatini ekrana yazdirma
		System.out.println("Urunun KDV'siz fiyati :" + kdvsizFiyat);
		System.out.println(kdvOrani3);
		System.out.println("KDV Tutari :" + kdvTutari );
		System.out.println("Urunun KDV'li fiyati :" + kdvliFiyat);
		

	}

}
