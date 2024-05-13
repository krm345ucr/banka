package atm;


import java.util.Scanner;


public class proje2 {
	
	static 	Scanner klavyeScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int girishakkı=3;
		int dsifre =1234;
		
		for(int i=0;i<girishakkı;i++) {
			System.out.println("şifreyi giriniz");
			int sifre=klavyeScanner.nextInt();
			if(dsifre==sifre) {
				System.out.println("giriş başarılı");
			}	
			else {
				girishakkı--;
				System.out.println("yanlış şifre girildi kalan giriş hakkınız:"+girishakkı);
			}
		}
		
			
			
		
		
		
		
		
		
		
		/*
		System.out.println("en fazla 20 harflik bir kelime giriniz");
		String kelime=klavyeScanner.nextLine();
		if(kelime.length()>20) {
				System.out.println("20 harften kısa olsun ");
				
		}*/
		/*
		int harfsayısı=0;
		for (int i=0;i<kelime.length();i++) {
			char harf = 0 ;
			
			if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
				harfsayısı++;
	            System.out.println(harf + " bir sesli harftir.");
	        } 
			
		}
		System.out.println("sesli harf "+harfsayısı);
		*/
		
		
		
		
		
		/*
		System.out.println("hava durumunu giriniz");
		int sıcaklık=klavyeScanner.nextInt();
		
		if(sıcaklık<=0) {
			System.out.println("kar topu oyna");
		}
		else if(sıcaklık>0 && sıcaklık<=20) {
			System.out.println("kahve içmeye git");
		}
		else if(sıcaklık>20) {
			System.out.println("denize gir2");
		}
		*/
		
		
		
		
		
		/*
		System.out.println("bir sayı giriniz");
		int sayi=klavyeScanner.nextInt();
		int toplam=0;
		for (int i=1;i<=sayi;i++) {
			
			if(sayi%i==0) 
			{
				toplam+=i;
			}
			
		}
		System.out.println(toplam);
		*/
		
		
		
		
		
		/*
		int fak=1;
		System.out.println("bir sayı giriniz");
		int sayi1=klavyeScanner.nextInt();
		
		for (int i=1;i<=sayi1;i++) {
			fak*=i;
			
			
		}
		System.out.println("faktöriyeli:"+fak);
		*/
		
		
		
		/*
		System.out.println("iki sayı giriniz");
		
		int sayi=klavyeScanner.nextInt();
		
		int sayi2=klavyeScanner.nextInt();
		
		System.out.println("toplam:"+(sayi+sayi2));
		
		*/
		
		
		
		
		
		
		/*
		int sayi1;
		
		for (int i=0;i<=sayi1;i++) {
			System.out.println("bir sayı giriniz");
			sayi1=klavyeScanner.nextInt();
			
		}
		
		while (sayi1 !=0) {
			int kactane=0;
			for (int i=0;i<sayi1;i++) {
				
				
			}
			
		}
		*/
		
		
		
		
		
		
			
		
		 	/*Scanner scanner = new Scanner(System.in);

	        System.out.print("Dizi boyutunu girin: ");
	        int boyut = scanner.nextInt();

	        int[] dizi = new int[boyut];

	        System.out.println("Dizi elemanlarını girin:");

	        for (int i = 0; i < boyut; i++) {
	            System.out.print("Eleman " + (i + 1) + ": ");
	            dizi[i] = scanner.nextInt();
	        }

	        System.out.print("Bir sayı girin: ");
	        int sayi = scanner.nextInt();

	        int kucukElemanSayisi = 0;
	        									
	        for (int i = 0; i < boyut; i++) {
	            if (dizi[i] < sayi) {
	                kucukElemanSayisi++;
	            }
	        }

	        System.out.println(sayi + " sayısı, dizinin " + kucukElemanSayisi + " elemanından küçüktür.");
	        */
	    
		
		
		
		
		/*
		int fak =1;
		System.out.println("bir sayı giriniz");
		double sayi1=klavyeScanner.nextInt();
		
		if(5<sayi1 && sayi1<10) {
			System.out.println(sayi1*sayi1);
		}
		else if(sayi1<=5) {
			for(int i=1;i<=sayi1;i++) {
				
				fak*=i;
				
			}
			System.out.println(fak);
		}
		else if(10<=sayi1) {
			System.out.println((sayi1/2)-1);
			
		}*/
		
		
		
		
		
		/*
		int[] dizi=new int[10];
		int enkucuk=dizi[0];
		int enkucukindis=0;
		for(int i=0;i<10;i++) {
			System.out.println("bir sayı giriniz");
			dizi[i]=klavyeScanner.nextInt();
			if(dizi[i]<enkucukindis) {
				enkucuk=dizi[i];
				enkucukindis=i;
			}
			
		}
		System.out.println(enkucuk);
		System.out.println(enkucukindis);
		
		*/

		/*
		klavyeden 0 girilinceye kadar sayı girilmesini sağlayın,
		bu sayıların kaç tane olduğunu, toplamını ve ortalamasını
		bulup sonucu ekrana yazdıran java kodunu oluşturunuz*/
		
		/*
		int sayi1=1, topla=0, adet=0;
		float ort=0;
		while(sayi1 !=0) {
			System.out.print("Sayı Giriniz: ");
			sayi1=klavyeScanner.nextInt();
			topla=topla+sayi1;
			adet++;
			
		}
		ort=topla/(adet-1);
		
		if(sayi1==1) {
			System.out.println("Sayı girişi yapmadın.");
			
		}else {
			System.out.println("Sayıların Toplamı: "+topla);
			System.out.println("Sayıların adedi: "+adet);
			System.out.println("Sayıların ortalaması: "+ort);
		}*/
		
		/*
		* 10 elemanlı bir sayı dizisine en küçük elemanın
		* bu dizinin kaçıncı elemanı olduğunu
		* bulan programı yazınınz
		* */
		/*
		int[] dizi=new int[10];
		int enKucuk = dizi[0];
		int enKucukIndex = 0;
		
		for(int i=0;i<10;i++) {
			System.out.println("bir sayı giriniz");
			dizi[i]=klavyeScanner.nextInt();
			
		}
		
		
			
 		for (int i = 1; i < dizi.length; i++) {
 				if (dizi[i] < enKucuk) {
 					enKucuk = dizi[i];
 					enKucukIndex = i;
 				}
 		}*/
		
		
		
		
	}

}
