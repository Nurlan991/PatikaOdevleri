import java.util.Scanner;


public class SinifGecme {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matemataik notu: ");
		mat = input.nextInt();
		System.out.print("Fizik notu: ");
		fizik = input.nextInt();
		System.out.print("Türkçe notu: ");
		turkce = input.nextInt();
		System.out.print("Kimya notu: ");
		kimya = input.nextInt();
		System.out.print("Muzik notu: ");
		muzik = input.nextInt();
		
		if ((mat>=0 && mat <=100) && (fizik >= 0 && fizik <= 100) && (turkce >=0 && 
				turkce<=100) && (kimya>=0 && kimya<=100) && (muzik >= 0 &&muzik<=100)){
			double ortalama = (mat + fizik + turkce + kimya + muzik)/5;
			if (ortalama >= 55) {
				System.out.println("Tebrikler! Sınıf geçtiniz!");
			}else {
				System.out.println("Sınıfta kaldınız!");
			}System.out.println("Ortalama notunuz: " + ortalama);
		}else {
			System.out.println("Hata! Notunuz 100'den büyük 0'dan küçük olamaz!");
		}

	}

}
