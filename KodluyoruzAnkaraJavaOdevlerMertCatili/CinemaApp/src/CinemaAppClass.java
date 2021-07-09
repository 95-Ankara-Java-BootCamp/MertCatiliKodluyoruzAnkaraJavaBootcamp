import java.util.Scanner;
public class CinemaAppClass {
	public static Scanner share = new Scanner(System.in); //Kullanýcýdan string deðer alabilmek için Scanner sýnýfýný kullandýk.

	public static void Calculation() {
		double ticketPrice=30;//Bilet fiyatlarý sürekli deðiþkenlik gösterebileceðinden ötürü bir deðiþkende tutuyoruz.
		System.out.println("Hangi Kategoriyi Seçmek Ýstersiniz? Fiyatlarýmýz Sabit 30TL'dir ve Yaþýnýza ve seçtiðiniz kategoriye baðlý fiyatlarýmýz deðiþiklik gösterebilir. (komedi , korku, dram)");
		String category = share.nextLine();
		switch(category) {
		case "korku":AgeFilter(ticketPrice-(ticketPrice*10)/100);break;//Ücreti AgeFilter fonksiyonuna göndermeden önce kategoriye göre fiyatlandýrýp gönderiyoruz.
		case "komedi":AgeFilter(ticketPrice);break;
		case "dram":AgeFilter(ticketPrice);break;
		default: System.out.println("Þu an seçtiðiniz kategoride bir film bulunmamaktadýr.");break;
		}
	}
	public static void AgeFilter(double paramater) {//Calculation fonksiyonundan aldýðýmýz ücreti yaþa göre biçimlendirip ekrana bastýrýyoruz.
		double result=0;
		System.out.println("Yaþýnýz kaç?");
		int age = share.nextInt();
		if(age<18) {
			result=(paramater-(paramater*10)/100);
		}
		else if(age>18&&age<25)
		{
			result=(paramater-(paramater*5)/100);
		}
		else
		{
			result=paramater;
		}
		System.out.println("Ödeyeceðiniz Miktar: "+result);
	}
	public static void main(String[] args) {
		Calculation();//Calculation fonksiyonunu çaðýrýyoruz.
	}

}
