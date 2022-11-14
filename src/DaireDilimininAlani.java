/**
 * @author Nurlan
 */

/* Daire diliminin alanını hesaplayan program
   yarıçapı = r
   merkez açısı ölçüsü = a
   pi = 3.14
   formül = (pi*(r*r)*a)/360
 */



import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double r, a, pi = 3.14, alan;
		System.out.print("Yarıçapı: ");
		r = input.nextDouble();
		System.out.print("Merkez açısı: ");
		a = input.nextDouble();
		
		alan = (pi*(r*r)*a)/360;
		
		System.out.print("Alan: " + alan);

	}

}
