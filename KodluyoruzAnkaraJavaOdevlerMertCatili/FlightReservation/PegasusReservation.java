import java.util.Random;
public class PegasusReservation extends FlightReservationClass {
int islem;
	
	public PegasusReservation() {
		
	}
	
	
	public PegasusReservation(int koltukSayisi) {
		super(koltukSayisi);
	}
	
	@Override
	public void RezervasyonAl() {
		System.out.println("Pegasus tercih ettiðiniz için teþekkür ederiz!"+"\n"+"- Business class uçmak için 0' a basýnýz , ekonomi class uçmak için 1'e basýnýz: ");
		islem = scanner.nextInt();
		EkonomiOrBusiness(islem);
	}

	private void EkonomiOrBusiness(int islem) {
		// TODO Auto-generated method stub
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
		Random rnd = new Random();
		
		 if (ekonomiDoluMu()) {
			 System.out.println("Ekonomi Class Koltuklarý Doludur.");
		 }
		 else {
			 int rastgeleKoltuk =  rnd.nextInt(koltuklar.length);
			 if(rastgeleKoltuk<6 || rastgeleKoltuk>koltuklar.length || koltuklar[rastgeleKoltuk]==true) {
				 rastgeleKoltuk = rnd.nextInt(koltuklar.length+1);
				}
			 System.out.println("Koltuk no: "+rastgeleKoltuk+" adýnýza rezerve edildi!");
	         System.out.println("Ýyi uçuþlar!");
	         koltuklar[rastgeleKoltuk-1]=true;
		 }
		
	}

	private void BusinessClassTicket() {
		// TODO Auto-generated method stub
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
