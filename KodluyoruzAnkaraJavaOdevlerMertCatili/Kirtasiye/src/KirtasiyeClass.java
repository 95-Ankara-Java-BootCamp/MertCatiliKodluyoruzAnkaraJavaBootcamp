import java.util.Scanner;

public class KirtasiyeClass {
	
	public static void Calculation() {
		int control=1;
		Scanner share = new Scanner(System.in); //Kullan�c�dan string de�er alabilmek i�in Scanner s�n�f�n� kulland�k.
		System.out.println("Hangi �r�n� Ald�n�z? Ald���n�z �r�nlerin tek tek ismini yazarak listeye eklemi� olursunuz.(kalem, silgi, boya) E�er bitti komutunu girerseniz listeyi g�r�nt�leyebilirsiniz. ");
		int[] values = new int[3];//Verilerin tutulaca�� liste.
		while(control==1)//Bitti komutuna kadar d�necek olan d�ng�.
		{
		    String value = share.nextLine();//Her seferinde d�ng� d�nc�k�e kullan�c�dan veri al�yoruz.
		    switch(value) {
		    case "kalem":values[0]++;break;//Girilen de�ere g�re verileri art�r�yoruz.
		    case "silgi":values[1]++;break;
		    case "boya":values[2]++;break;
		    case "bitti":control=0;break;//Bitti komutu gelirse e�er control de�erini 0 yap�yor ve bu bizi d�ng�den ��kmam�za yard�mc� oluyor.
		    default: System.out.println("L�tfen kalem, silgi, boya �r�n�lerini kullan�n�z.");break;//kalem, silgi, boya, bitti komutlar� d���nda bir komut girilirse bu �ekilde bir uyar� d�nd�r�yor ve ba�a al�yor.
		    }
		}
		Result(values);//Verileri ekrana bast�raca��m�z fonksiyona verilerin tutuldu�u values listesini g�nderiyoruz.
	}
	public static void Result(int list[]) {//Calculation fonksiyonundan g�nderilen listeyi par�alara b�l�p istenilen ��kt�lar� ekrana bast�r�yoruz.
		System.out.println("Toplam "+(list[0]+list[1]+list[2])+" tane mal ald�. ");
		for(int i = 0; i<3; i++)
		{
			switch(i) {
			case 0:System.out.println("Kalem �r�n�nden "+list[i]+" tane al�nd�. ");break;
			case 1:System.out.println("Silgi �r�n�nden "+list[i]+" tane al�nd�. ");break;
			case 2:System.out.println("Boya �r�n�nden "+list[i]+" tane al�nd�. ");break;
			}
		}
		System.out.println(list.length+" tane �r�n bulunmaktad�r.");
	}
	public static void main(String[] args) {
		Calculation();//Calculation fonksiyonunu �a��r�yoruz.
	}

}
