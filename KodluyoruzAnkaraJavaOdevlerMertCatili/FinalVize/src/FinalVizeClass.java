import java.util.Scanner;	
public class FinalVizeClass {

	public static void Grading() {
		Scanner share = new Scanner(System.in); //Kullan�c�dan string de�er alabilmek i�in Scanner s�n�f�n� kulland�k.
	     System.out.print("Vize S�nav Sonucunuz Nedir? ");
	     int midtermGet = share.nextInt();//Vize de�erini ald�k.
	     System.out.print("Final S�nav Sonucunuz Nedir? ");
	     int finalGet = share.nextInt();//Final de�erini ald�k.
        int valueNote = ((midtermGet*50)/100) + ((finalGet*70)/100);//Puan Hesaplamas�n� yapt�k.
        if(valueNote>=70&&valueNote<=100)//�f bloklar�nda sonucu kar��la�t�r�p kar��l�k geren harf notunu ekrana bast�rd�k.
        {
        	System.out.println("AA");
        }
        else if(valueNote>=50&&valueNote<=70)
        {
        	System.out.println("BB");
        }
        else if(valueNote>=20&&valueNote<=50)
        {
        	System.out.println("CB");
        }
        else if(valueNote>=0&&valueNote<=20)
        {
        	System.out.println("FF");
        }

        
    }
	public static void main(String[] args) {
		 Grading(); //Grading fonksiyonunu �a��rd�k.
	}

}
