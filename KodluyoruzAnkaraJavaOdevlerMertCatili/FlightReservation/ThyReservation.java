
public class ThyReservation extends FlightReservationClass {

	int islem;

	public ThyReservation() {
		
	}
	public ThyReservation(int koltukSayisi) {
		super(koltukSayisi);
	}
	
	@Override
	public void RezervasyonAl() {
		
		System.out.println("THY tercih ettiðiniz için teþekkür ederiz!"+"\n"+"- Business class uçmak için 0' a basýnýz , ekonomi class uçmak için 1'e basýnýz: ");
		islem = scanner.nextInt();
		EkonomiOrBusiness(islem);
	}

	private void EkonomiOrBusiness(int islem) {
		if(islem==0) {
			System.out.println("Business class verileri yükleniyor , lütfen bekleyiniz..");
			BusinessClassTicket();
		}
		else if(islem==1)
		{
			System.out.println("Ekonomi class verileri yükleniyor , lütfen bekleyiniz..");
			EconomiClassTicket();
		}
		else
			System.out.println("Hatalý giriþ yaptýnýz.");
		return;
	}

	private void EconomiClassTicket() {
		 if (ekonomiDoluMu()) {
			 System.out.println("Ekonomi Class Koltuklarý Doludur.");
		 }
		 else {
			 System.out.println("Aþaðýdaki boþ koltuklardan birini seçiniz:");
			 for (int i = 5; i < koltuklar.length; i++) {
		 			if (koltuklar[i] == false) {
		 				System.out.print(i+1+" ");
		 			}
		 		}
			 System.out.println();	
	         int Koltuksecim = scanner.nextInt();
			 System.out.println("Koltuk no: "+Koltuksecim+" adýnýza rezerve edildi!");
	         System.out.println("Ýyi uçuþlar!");
	         koltuklar[Koltuksecim-1]=true;
		 }
	}

	private void BusinessClassTicket() {
	    
		if(businessDoluMu()) {
			System.out.println("Business Class Koltuklarý Doludur.");
		}
		else {
			 System.out.println("Aþaðýdaki boþ koltuklardan birini seçiniz:");
			 for (int i = 1; i <6; i++) {
				if(koltuklar[i]== false ) {
					System.out.print(i+" ");
				}
			}
			 System.out.println();	
	         int Koltuksecim = scanner.nextInt();
			 System.out.println("Koltuk no: "+Koltuksecim+" adýnýza rezerve edildi!");
	         System.out.println("Ýyi uçuþlar!");
	         koltuklar[Koltuksecim]=true;
		}
	}

}
