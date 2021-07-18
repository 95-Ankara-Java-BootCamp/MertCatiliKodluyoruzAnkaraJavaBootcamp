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
		System.out.println("Pegasus tercih etti�iniz i�in te�ekk�r ederiz!"+"\n"+"- Business class u�mak i�in 0' a bas�n�z , ekonomi class u�mak i�in 1'e bas�n�z: ");
		islem = scanner.nextInt();
		EkonomiOrBusiness(islem);
	}

	private void EkonomiOrBusiness(int islem) {
		// TODO Auto-generated method stub
		if(islem==0) {
			System.out.println("Business class verileri y�kleniyor , l�tfen bekleyiniz..");
			BusinessClassTicket();
		}
		else if(islem==1)
		{
			System.out.println("Ekonomi class verileri y�kleniyor , l�tfen bekleyiniz..");
			EconomiClassTicket();
		}
		else
			System.out.println("Hatal� giri� yapt�n�z.");
		return;
	}

	private void EconomiClassTicket() {
		Random rnd = new Random();
		
		 if (ekonomiDoluMu()) {
			 System.out.println("Ekonomi Class Koltuklar� Doludur.");
		 }
		 else {
			 int rastgeleKoltuk =  rnd.nextInt(koltuklar.length);
			 if(rastgeleKoltuk<6 || rastgeleKoltuk>koltuklar.length || koltuklar[rastgeleKoltuk]==true) {
				 rastgeleKoltuk = rnd.nextInt(koltuklar.length+1);
				}
			 System.out.println("Koltuk no: "+rastgeleKoltuk+" ad�n�za rezerve edildi!");
	         System.out.println("�yi u�u�lar!");
	         koltuklar[rastgeleKoltuk-1]=true;
		 }
		
	}

	private void BusinessClassTicket() {
		// TODO Auto-generated method stub
		if(businessDoluMu()) {
			System.out.println("Business Class Koltuklar� Doludur.");
		}
		else {
			 System.out.println("A�a��daki bo� koltuklardan birini se�iniz:");
			 for (int i = 1; i <6; i++) {
				if(koltuklar[i]== false ) {
					System.out.print(i+" ");
				}
			}
			 System.out.println();	
	         int Koltuksecim = scanner.nextInt();
			 System.out.println("Koltuk no: "+Koltuksecim+" ad�n�za rezerve edildi!");
	         System.out.println("�yi u�u�lar!");
	         koltuklar[Koltuksecim]=true;
		}
	}
}
