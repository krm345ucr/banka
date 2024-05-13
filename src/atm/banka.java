package atm;

import java.util.Scanner;





public class banka {
	
	
	public static void main(String[] args) {

		//banka uygulaması 
		
		
		Scanner klavyeScanner1 = new Scanner(System.in);
		System.out.println("UÇAR BANKA HOŞGELİDNİZ");
		int bakiye=5000;
		String sifre="kerim123";
		String kullanıcıadı="kerim";
		
		int maxgirishakkı=4;
		
		
		while (maxgirishakkı>0) {
			System.out.println("kullanıcı adını giriniz");
			String ka=klavyeScanner1.nextLine();
			System.out.println("şifrenizi giriniz");
			String sf=klavyeScanner1.nextLine();
			
			if(ka.equals(kullanıcıadı) && sf.equals(sifre)) {
				System.out.println("giriş işlemi başarılı");
				
				break;
				
			}
			else {
				maxgirishakkı--;
				System.out.println("bilgiler yanlış kalan giriş hakkı:"+maxgirishakkı);
				if(maxgirishakkı==0) {
					System.out.println("giriş hakkınız bitti");
				}
				
			}
			
		}
		
		while (bakiye>0) {
			System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
			System.out.println("1-)PARA YETIRMA");
			System.out.println("2-)PARA ÇEKME");
			System.out.println("3-)BAKİYE SORGULAMA");
			System.out.println("4-)KREDİ ÇEKME");
			System.out.println("5-)KREDİ ÖDEME");
			System.out.println("6-)ÇIKIŞ YAPMA");
			
			int secilenislem=klavyeScanner1.nextInt();
			
			if(secilenislem==1) {
				int y_t;
				System.out.println("yatırmak istediğiniz tutarı giriniz");
				y_t=klavyeScanner1.nextInt();
				System.out.println("son bakiye:"+(bakiye+y_t));
				
			}
			else if(secilenislem==2) {
				
				int c_t;
				System.out.println("çekmek istediğiniz tutarı giriniz");
				c_t=klavyeScanner1.nextInt();
				if(c_t<=5000) {
				
				System.out.println("son bakiye:"+(bakiye-c_t));
				}
				else {
					System.out.println("hesabınızda o kadar para yok kredi verebiliriz");
					System.out.println("kredi çekmek için 4 ü seçebilirsiniz ");
				}
			}
			else if(secilenislem==3){
				System.out.println("güncel bakiye:"+bakiye);
				
			}
			else if(secilenislem==4) {
				System.out.println("BANKAMIZA TEKRARDAN HOŞGELDİNİZ :)");
				System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ");
				int kreditutari=klavyeScanner1.nextInt();
				
				if(kreditutari<=50000) {
					System.out.println("faiz oranımız %5");
				}
				else if(kreditutari>50000 && kreditutari<=100000) {
					System.out.println("faiz oranımız %3");
					
				}
				else if(kreditutari>100000) {
					System.out.println("faiz oranımız %2");
				}
				else {
					System.out.println("yanlış işlem seçtiniz");
					break;
				}
			}
			else if(secilenislem==5) {
				System.out.println("ne kadar kredi çektiğinizi giriniz");
				int o_k=klavyeScanner1.nextInt();
				if(o_k<=50000) {
					System.out.println("ödenecek kredi borcunuz toplam:"+((o_k)+(o_k*0.05)));
					System.out.println("aylık ödeme:"+(((o_k)+(o_k*0.05)))/12);
				}
		
				else if(o_k>50000 && o_k<=100000) {
					System.out.println("ödenecek kredi borcunuz toplamda:"+((o_k)+(o_k*0.03)));
					System.out.println("aylık ödeme:"+(((o_k)+(o_k*0.03)))/12);
				}
				else if(o_k>100000) {
					System.out.println("ödenecek kredi borcunuz toplamda:"+((o_k)+(o_k*0.02)));
					System.out.println("aylık ödeme:"+(((o_k)+(o_k*0.02)))/12);
				}
			}
			else if (secilenislem==6) {
				System.out.println("Uçar bankı tercih ettiğiniz için teşekkürler");
				System.out.println("oturum kapatılıyor...");
				break;
			} 
			
		}
		
		
		
		
		
			
		
		

	}

}
