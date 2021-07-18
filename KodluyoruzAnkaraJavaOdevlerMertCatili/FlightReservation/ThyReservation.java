
public class ThyReservation extends FlightReservationClass {

	int islem;

	public ThyReservation() {
		
	}
	public ThyReservation(int koltukSayisi) {
		super(koltukSayisi);
	}
	
	@Override
	public void RezervasyonAl() {
		
		System.out.println("THY tercih etti�iniz i�in te�ekk�r ederiz!"+"\n"+"- Business class u�mak i�in 0' a bas�n�z , ekonomi class u�mak i�in 1'e bas�n�z: ");
		islem = scanner.nextInt();
		EkonomiOrBusiness(islem);
	}

	private void EkonomiOrBusiness(int islem) {
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
		 if (ekonomiDoluMu()) {
			 System.out.println("Ekonomi Class Koltuklar� Doludur.");
		 }
		 else {
			 System.out.println("A�a��daki bo� koltuklardan birini se�iniz:");
			 for (int i = 5; i < koltuklar.length; i++) {
		 			if (koltuklar[i] == false) {
		 				System.out.print(i+1+" ");
		 			}
		 		}
			 System.out.println();	
	         int Koltuksecim = scanner.nextInt();
			 System.out.println("Koltuk no: "+Koltuksecim+" ad�n�za rezerve edildi!");
	         System.out.println("�yi u�u�lar!");
	         koltuklar[Koltuksecim-1]=true;
		 }
	}

	private void BusinessClassTicket() {
	    
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
