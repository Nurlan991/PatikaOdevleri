import java.util.Scanner;

public class NotOrtalamasiHesaplamaProgrami {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matematik, fizik, kimya, turkce, tarih, muzik;
		double ortalama;
		
		System.out.print("Matematik dersinden notunuzu giriniz :");
		matematik = scan.nextInt();
		System.out.print("Fizik dersinden notunuzu giriniz :");
		fizik = scan.nextInt();
		System.out.print("Kimya dersinden notunuzu giriniz :");
		kimya = scan.nextInt();
		System.out.print("Türkçe dersinden notunuzu giriniz :");
		turkce = scan.nextInt();
		System.out.print("Tarih dersinden notunuzu giriniz :");
		tarih = scan.nextInt();
		System.out.print("Müzik dersinden notunuzu giriniz :");
		muzik = scan.nextInt();
		
		ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6;
		
		String sonuc = (ortalama >= 60) ? "Tebrikler! Geçtiniz!" : "Malesef! Geçemediniz!";
		System.out.println("Sizin ortalama notunuz:" + ortalama);
		System.out.println(sonuc);

	}

}
