import java.util.Scanner;
public class CinemaAppClass {
	public static Scanner share = new Scanner(System.in); //Kullan�c�dan string de�er alabilmek i�in Scanner s�n�f�n� kulland�k.

	public static void Calculation() {
		double ticketPrice=30;//Bilet fiyatlar� s�rekli de�i�kenlik g�sterebilece�inden �t�r� bir de�i�kende tutuyoruz.
		System.out.println("Hangi Kategoriyi Se�mek �stersiniz? Fiyatlar�m�z Sabit 30TL'dir ve Ya��n�za ve se�ti�iniz kategoriye ba�l� fiyatlar�m�z de�i�iklik g�sterebilir. (komedi , korku, dram)");
		String category = share.nextLine();
		switch(category) {
		case "korku":AgeFilter(ticketPrice-(ticketPrice*10)/100);break;//�creti AgeFilter fonksiyonuna g�ndermeden �nce kategoriye g�re fiyatland�r�p g�nderiyoruz.
		case "komedi":AgeFilter(ticketPrice);break;
		case "dram":AgeFilter(ticketPrice);break;
		default: System.out.println("�u an se�ti�iniz kategoride bir film bulunmamaktad�r.");break;
		}
	}
	public static void AgeFilter(double paramater) {//Calculation fonksiyonundan ald���m�z �creti ya�a g�re bi�imlendirip ekrana bast�r�yoruz.
		double result=0;
		System.out.println("Ya��n�z ka�?");
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
		System.out.println("�deyece�iniz Miktar: "+result);
	}
	public static void main(String[] args) {
		Calculation();//Calculation fonksiyonunu �a��r�yoruz.
	}

}
