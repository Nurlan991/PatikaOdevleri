/**
 * @author Nurlan
 */
/*
 * Kullanıcı girişi
 * 
 * Eğer kullanici adı yanlış ise kullanıcı adının yanlış olduğunu yazar
 * Eğer kullanici adı ve şifre doğru ise başarılı giriş
 * Eğer şifre yanlış ise şifrenin yanlış olduğunu yazar ve yenilemek isteyip-istemediğini sorar
 * Eğer yeni  şifre eski şifre ile aynı olarsa yeniden deneyin yazar
 * 
 */

import java.util.Scanner;

public class KullaniciGirisiDeneme {

	public static void main(String[] args) {
		
		String username, password, choice, newpassword;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz: ");
		username = scan.nextLine();
		
		if (username.equals("nurlan")) {
			System.out.print("Şifrenizi giriniz: ");
			password = scan.nextLine();
			if (password.equals("zekiyev")) {
				System.out.println("Giriş yapıldı!");
			}else {
				System.out.println("Girdiğiniz şifre yanlış! \nŞifreni yenilemek ister misiniz?\n1-Evet\n2-Hayır");
			}choice = scan.nextLine();
			if (choice.equals("1")) {
				System.out.print("Yeni şifrenizi giriniz: ");
				newpassword = scan.nextLine();
				if (newpassword.equals("zekiyev")) {
					System.out.println("Yeni girdiğiniz şifre eski şifrenizle aynı! Bir daha deneyin!");
				}else {
					System.out.println("Şifreniz yenilendi!");
				}
			}else if(choice.equals("2")) { 
				System.out.println("Lütfen doğru şifreyi giriniz!");
				}else {
					System.out.println("Hata!!!");
				}
			}else {
				System.out.println("Kullanıcı adınız yanlış!");
		}	
	}

}
