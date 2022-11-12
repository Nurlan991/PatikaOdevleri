import java.util.Scanner;

public class UcgeninAlaniniHesaplama {

	public static void main(String[] args) {
		
		int a,b,c;                                        //kulanıcının girdiği değerler
		
		Scanner kenar = new Scanner(System.in);
		System.out.print("a kenarını giriniz :");
		a = kenar.nextInt();
		System.out.print("b kenarını giriniz :");
		b = kenar.nextInt();
		System.out.print("c kenarını giriniz :");
		c = kenar.nextInt();
		
		double u = (a+b+c)/2;                             //üçgenin yarımçevresini hesaplayan formül
		double S = Math.sqrt((u*(u-a)*(u-b)*(u-c)));      //üçgenin alanını hesaplayan formül
		
		System.out.println("Üçgenin alanı :" + S);

	}

}
