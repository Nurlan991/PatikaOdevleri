/**
 * @author Nurlan
 */
/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.

 */


import java.util.Scanner;

public class BurcBulanProgram {

	public static void main(String[] args) {
		
		String ay, burc = "";
		int gun;
		boolean isError = false;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ayı giriniz: ");
		ay = inp.nextLine();
		System.out.print("Doğduğunuz günü giriniz: ");
		gun = inp.nextInt();
		
		if ((ay.equals("ocak")) || (ay.equals("Ocak")) || (ay.equals("şubat")) ||
				(ay.equals("Şubat")) || (ay.equals("mart")) || (ay.equals("Mart")) || (ay.equals("nisan")) || (ay.equals("Nisan")) ||
				(ay.equals("mayıs")) || (ay.equals("Mayıs")) || (ay.equals("haziran")) || (ay.equals("Haziran")) || 
				(ay.equals("temmuz")) || (ay.equals("Temmuz")) || (ay.equals("ağustos")) || (ay.equals("Ağustos")) ||
				(ay.equals("Eyül")) || (ay.equals("Eylül")) || (ay.equals("ekim")) || (ay.equals("Ekim")) ||
				(ay.equals("kasım")) || (ay.equals("Kasım")) || (ay.equals("aralık")) || (ay.equals("Aralık"))) {
			
			if ((ay.equals("ocak")) || (ay.equals("Ocak"))) {    //OCAK
				if ((gun >= 1) && (gun <= 31)){
					if (gun <= 21) {
						burc = "Oğlak";
				}else {
					burc = "Kova";
				}
			}else {
				isError = true;
			}
		}if ((ay.equals("şubat")) || (ay.equals("Şubat"))) {     //ŞUBAT
			if ((gun >= 1) && (gun <= 29)){
				if (gun <= 19) {
					burc = "Kova";
				}else {
					burc = "Balık";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("mart")) || (ay.equals("Mart"))) {   //MART
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 20) {
					burc = "Balık";
				}else {
					burc = "Koç";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("nisan")) || (ay.equals("Nisan"))) {    //NİSAN
			if ((gun >= 1) && (gun <= 30)){
				if (gun <= 20) {
					burc = "Koç";
				}else {
					burc = "Boğa";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("mayıs")) || (ay.equals("Mayıs"))) {    //MAYIS
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 21) {
					burc = "Boğa";
				}else {
					burc = "İkizler";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("haziran")) || (ay.equals("Haziran"))) {   //HAZİRAN
			if ((gun >= 1) && (gun <= 30)){
				if (gun <= 22) {
					burc = "İkizler";
				}else {
					burc = "Yengeç";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("temmuz")) || (ay.equals("Temmuz"))) {  //TEMMUZ
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 22) {
					burc = "Yengeç";
				}else {
					burc = "Aslan";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("ağustos")) || (ay.equals("Ağustos"))) {   //AĞUSTOS
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 22) {
					burc = "Aslan";
				}else {
					burc = "Başak";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("eylül")) || (ay.equals("Eylül"))) {  //EYLÜL
			if ((gun >= 1) && (gun <= 30)){
				if (gun <= 22) {
					burc = "Başak";
				}else {
					burc = "Terazi";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("ekim")) || (ay.equals("Ekim"))) {   //EKİM
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 22) {
					burc = "Terazi";
				}else {
					burc = "Akrep";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("kasım")) || (ay.equals("Kasım"))) {  //KASIM
			if ((gun >= 1) && (gun <= 30)){
				if (gun <= 21) {
					burc = "Akrep";
				}else {
					burc = "Yay";
				}
			}else {
				isError = true;
			}
		}else if ((ay.equals("aralık")) || (ay.equals("Aralık"))) {  //ARALIK
			if ((gun >= 1) && (gun <= 31)){
				if (gun <= 21) {
					burc = "Yay";
				}else {
					burc = "Oğlak";
				}
			}else {
				isError = true;
			}
		}if(isError) {
			System.out.println("Hata! Lütfen doğru bilgileri giriniz!");
		}else {
			System.out.println("Burcunuz: " + burc);
			}
		}else {
			System.out.println("Hata! Lütfen tekrar deneyiniz!");
		}
	
	} 

}
