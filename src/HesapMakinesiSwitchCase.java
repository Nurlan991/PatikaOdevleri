import java.util.Scanner;

public class HesapMakinesiSwitchCase {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
		
		double ilkSayi, ikinciSayi;
		int islem;
		
		System.out.print("İlk sayıyı giriniz: ");
		ilkSayi = inp.nextDouble();
		System.out.print("İkinci sayıyı giriniz: ");
		ikinciSayi = inp.nextDouble();
		System.out.println("İşlemi seçiniz: \n1-Toplama\n2-Çıkma\n3-Vurma\n4-Bölme");
		islem = inp.nextInt();
		
		switch (islem) {
		case 1:
			System.out.println("Cevap: " + (ilkSayi + ikinciSayi));
			break;
	
		case 2:
			System.out.println("Cevap: " + (ilkSayi - ikinciSayi));
			break;
			
		case 3:
			System.out.println("Cevap: " + (ilkSayi * ikinciSayi));
			break;
			
		case 4:
			if (ikinciSayi != 0)
			System.out.println("Cevap: " + (ilkSayi / ikinciSayi));
			else  System.out.println("Hata!!! Hiç bir sayı 0'a bölünemez!!!");
			break;
		default:
			System.out.println("Hatalı işlem seçtiniz!!!");
		}

	}

}
