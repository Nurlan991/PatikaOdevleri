import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		
		int dogumYili, burc;
		String zodyak = "";
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Doğum yılınızı giriniz: ");
		dogumYili = input.nextInt();
		
		burc = dogumYili%12;
		
		switch (burc) {
		
		case 0:
			zodyak = "Maymun";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 1:
			zodyak = "Horoz";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 2:
			zodyak = "Köpek";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 3: 
			zodyak = "Domuz";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 4:
			zodyak = "Fare";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 5:
			zodyak = "Öküz";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 6:
			zodyak = "Kaplan";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 7:
			zodyak = "Tavşan";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 8:
			zodyak = "Ejderha";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 9:
			zodyak = "Yılan";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 10:
			zodyak = "At";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
		case 11:
			zodyak = "Koyun";
			System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
			break;
			default:
				System.out.println("Hata! Lütfen tekrar deneyiniz!");
		}
		
	}

}
