package classlar;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("ARAÇ UYGULAMASINA HOŞGELDİNİZ...");
		System.out.println("\n Lütfen bir seçim yapınız:\n");
		String giris="1-Kamyon\n"+"2-Motorsiklet\n";
		System.out.println(giris);
		int secim=scanner.nextInt();
		
		if(secim==1) {
			int trafikCezaTutari=750;
			kamyon kamyon=new kamyon(1L,"kamyon","Siyah", 400000, 4, "Marka1", "Model1", trafikCezaTutari);
			System.out.println("1-Kamyonun bilgilerini göster\n"+"2-Trafik cezasını öde\n");
			int kamyonSecim=scanner.nextInt();
			if(kamyonSecim==1) {
				kamyon.aracBilgileriGoster();
			}
			else if (kamyonSecim==2) {
				kamyon.trafikCezasiOde(trafikCezaTutari);
			}
			else {
				System.out.println("Lütfen geçerli bir rakam giriniz.");
			}
		}
		else if (secim==2) {
			int trafikCezaTutari=600;
			motorsiklet motorsiklet=new motorsiklet(2L,"motorsiklet" , "kırmızı", 200000,2,"marka2", "model2", trafikCezaTutari);
			System.out.println("1-Motorun bilgilerini göster\n"+"2-Trafik cezasını öde\n");
		    int motorSecim=scanner.nextInt();
		    
		    if(motorSecim==1) {
				motorsiklet.aracBilgileriGoster();
			}
			else if (motorSecim==2) {
				motorsiklet.trafikCezasiOde(trafikCezaTutari);
			}
			else {
				System.out.println("Lütfen geçerli bir rakam giriniz.");
			}
		    
		
		}
		else {
			System.out.println("Lütfen geçerli bir rakam giriniz.1");
		}
		
	}

}
