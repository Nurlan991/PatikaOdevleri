import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		
		int hava;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Hava sicakligi: ");
		hava = scan.nextInt();
		
		if (hava <= 5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if (hava > 5 && hava <= 15) {
			System.out.println("Sinemaya gidebilirsiniz. ");
		}
		else if (hava > 15 && hava <= 25 ) {
			System.out.println("Piknike gidebilirsiniz. ");
		}
		else if (hava > 25) {
			System.out.println("Yuzmeye gidebilirsiniz. ");
					
		}
	}

}

