import java.util.Scanner;

public class TaksimetreProgrami {

	public static void main(String[] args) {
		
		double mesafe, minTutar = 20, fiyat = 2.20, acilisUcreti = 10, tutar;
		
		Scanner km = new Scanner(System.in);
		
		System.out.print("Gidilecek mesafe: ");
		mesafe = km.nextDouble();
		
		tutar = (mesafe*fiyat)+acilisUcreti;
		
		System.out.println("Fiyat: " + fiyat + "TL");
		System.out.println("Minimum ücret: " + minTutar + "TL");
		System.out.println("Taksimetre açılış ücreti: " + acilisUcreti + "TL");
		
		String ucret = (tutar<20) ? "Ödenilecek Ücret (min tutar) : 20TL" : "Ödenilecek Ücret :" + tutar + "TL";
		System.out.print(ucret);
		

	}

}
