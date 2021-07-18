import java.util.Scanner;
public abstract class FlightReservationClass {
	Scanner scanner = new Scanner(System.in);
	private int koltukSayisi;
	protected boolean  koltuklar[];
	
	public FlightReservationClass() {
		  setKoltukSayisi(10);
	}
	
	public FlightReservationClass(int koltukSayisi) {
		if (koltukSayisi < 10) {
			System.out.println("Koltuk sayisi minimum 10 olmalýdýr.");
			this.koltukSayisi = 10;
		} else {
			this.koltukSayisi = koltukSayisi;
		}
		
		this.koltuklar = new boolean[this.koltukSayisi];
	}
	
	public boolean ekonomiDoluMu() {	     
	     for (int i = 5; i < koltuklar.length; i++) {
				if (koltuklar[i] == false) {
					System.out.println("Ekonomi sýnýfýmýzda boþ koltuklarýmýz mevcuttur.");
					return false;
				}
			}
	 	System.out.println("Ekonomi sýnýfýmýzda boþ koltuk kalmamýþtýr");
			return true;
	}
	public boolean businessDoluMu() {
		for (int i = 0; i < 5; i++) {
			if (koltuklar[i] == false) {
				 System.out.println("Business klasmanýnda boþ koltuklarýmýz mevcuttur.");
				return false;
			} 
		}
		System.out.println("Business klasmanýnda boþ koltuk kalmamýþtýr");
		return true;
	}
	
	public boolean ucakDoluMu() {
        if (businessDoluMu() == true && ekonomiDoluMu() == true) {
         	System.out.println("Boþ koltuk kalmamýþtýr.");
        	return true;
		}
        System.out.println("Boþ Koltuklar Mevcuttur.");
		return false;
	}
	
	public abstract void RezervasyonAl();

	public int getKoltukSayisi() {
		return koltukSayisi;
	}
	public void setKoltukSayisi(int koltukSayisi) {
		this.koltukSayisi= koltukSayisi;
		
	}

}
