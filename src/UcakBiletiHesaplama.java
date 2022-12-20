/**
 * @author Nurlan
 */
/*
 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
 * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
 * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın 
 * ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */


import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		
		int yas, tip;
		float mesafe, ucret = 0.1f, normalTutar, indirimTutari, indirimliFiyat;
		
		Scanner scan = new Scanner (System.in);
		
		//Kişinin yaşını alıyoruz. Doğru değer girdiyse devam, yanlış değer girdiyse hata mesajı
		
		System.out.print("Yaşınızı giriniz: ");
		yas = scan.nextInt();
		if (yas > 0) {
			
			//Gidilecek mesafeyi alıyoruz. Doğru değer girdiyse devam, yanlış değer girdiyse hata mesajı
			
			System.out.print("Gidilecek mesafeyi km olarak giriniz: ");
			mesafe = scan.nextFloat();
			normalTutar = mesafe*ucret;
			if (mesafe > 0) {
				
				//Yolculuk tipini alıyoruz. Doğru değer girdiyse devam, yanlış değer girdiyse hata mesajı
				
				System.out.println("Yolculuk tipini seçiniz: \n1 - Tek gidiş\n2 - Gidiş-Dönüş");
				tip = scan.nextInt();
				if (tip == 1) {
					
					//Kişi 12 yaşdan küçük ise %50 indirim
					
					if (yas <= 12) {
						indirimTutari = normalTutar*0.5f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" + 
								"\nYaş indirimi: %50\nÖdenilecek tutar: " + indirimliFiyat + "TL");
						
						//Kişi 12 yaşla 24 yaş arasında ise %10 indirim
						
					}else if ((yas > 12) && (yas <= 24)) {
						indirimTutari = normalTutar*0.1f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nYaş indirimi: %10\nÖdenilecek tutar: " + indirimliFiyat + "TL");
						
						//Kişi 65 yaş üzeri ise %30 indirim
						
					}else if (yas >= 65) {
						indirimTutari = normalTutar*0.3f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nYaş indirimi: %30\nÖdenilecek tutar: " + indirimliFiyat + "TL");
					}else {
						System.out.println("Ödenilecek tutar: " + normalTutar + "TL");
					}
				}else if (tip == 2) {
					
					//Kişi 12 yaşdan küçük ise %50 yaş + %20 gidiş-dönüş indirimi
					
					if (yas <= 12) {
						indirimTutari = normalTutar*0.7f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nYaş indirimi: %50\nGidiş-Dönüş indirimi: %20\nÖdenilecek tutar: " + indirimliFiyat + "TL");
						
						//Kişi 12 yaş ile 24 yaş arasında ise %10 yaş + %20 gidiş-dönüş indirimi
						
					}else if ((yas > 12) && (yas <= 24)) {
						indirimTutari = normalTutar*0.3f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nYaş indirimi: %10\nGidiş-Dönüş indirimi: %20\nÖdenilecek tutar: " + indirimliFiyat + "TL");
						
						//Kişi 65 yaş üzeri ise %30 yaş + %20 gidiş-dönüş indirimi
						
					}else if (yas >= 65) {
						indirimTutari = normalTutar*0.5f;
						indirimliFiyat = normalTutar - indirimTutari;
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nYaş indirimi: %30\nGidiş-Dönüş indirimi: %20\nÖdenilecek tutar: " + indirimliFiyat + "TL");
					}else {
						System.out.println("Normal tutar: " + normalTutar + "TL" +
								"\nGidiş-Dönüş indirimi: %20\nÖdenilecek tutar: " + (indirimliFiyat = normalTutar - (normalTutar*0.2f)) + "TL");
					}
				}else {
					System.out.println("Hata! Lütfen tekrar deneyiniz!");
				}
			}else {
				System.out.println("Hata! Lütfen tekrar deneyiniz!");
			}
		}else {
			System.out.println("Hata! Lütfen tekrar deneyiniz!");
		}

	}

}
