import java.util.Scanner;

public class KirtasiyeClass {
	
	public static void Calculation() {
		int control=1;
		Scanner share = new Scanner(System.in); //Kullanýcýdan string deðer alabilmek için Scanner sýnýfýný kullandýk.
		System.out.println("Hangi Ürünü Aldýnýz? Aldýðýnýz ürünlerin tek tek ismini yazarak listeye eklemiþ olursunuz.(kalem, silgi, boya) Eðer bitti komutunu girerseniz listeyi görüntüleyebilirsiniz. ");
		int[] values = new int[3];//Verilerin tutulacaðý liste.
		while(control==1)//Bitti komutuna kadar dönecek olan döngü.
		{
		    String value = share.nextLine();//Her seferinde döngü döncükçe kullanýcýdan veri alýyoruz.
		    switch(value) {
		    case "kalem":values[0]++;break;//Girilen deðere göre verileri artýrýyoruz.
		    case "silgi":values[1]++;break;
		    case "boya":values[2]++;break;
		    case "bitti":control=0;break;//Bitti komutu gelirse eðer control deðerini 0 yapýyor ve bu bizi döngüden çýkmamýza yardýmcý oluyor.
		    default: System.out.println("Lütfen kalem, silgi, boya ürünülerini kullanýnýz.");break;//kalem, silgi, boya, bitti komutlarý dýþýnda bir komut girilirse bu þekilde bir uyarý döndürüyor ve baþa alýyor.
		    }
		}
		Result(values);//Verileri ekrana bastýracaðýmýz fonksiyona verilerin tutulduðu values listesini gönderiyoruz.
	}
	public static void Result(int list[]) {//Calculation fonksiyonundan gönderilen listeyi parçalara bölüp istenilen çýktýlarý ekrana bastýrýyoruz.
		System.out.println("Toplam "+(list[0]+list[1]+list[2])+" tane mal aldý. ");
		for(int i = 0; i<3; i++)
		{
			switch(i) {
			case 0:System.out.println("Kalem Ürününden "+list[i]+" tane alýndý. ");break;
			case 1:System.out.println("Silgi Ürününden "+list[i]+" tane alýndý. ");break;
			case 2:System.out.println("Boya Ürününden "+list[i]+" tane alýndý. ");break;
			}
		}
		System.out.println(list.length+" tane ürün bulunmaktadýr.");
	}
	public static void main(String[] args) {
		Calculation();//Calculation fonksiyonunu çaðýrýyoruz.
	}

}
