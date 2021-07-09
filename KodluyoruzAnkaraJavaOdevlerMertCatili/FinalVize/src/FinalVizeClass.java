import java.util.Scanner;	
public class FinalVizeClass {

	public static void Grading() {
		Scanner share = new Scanner(System.in); //Kullanýcýdan string deðer alabilmek için Scanner sýnýfýný kullandýk.
	     System.out.print("Vize Sýnav Sonucunuz Nedir? ");
	     int midtermGet = share.nextInt();//Vize deðerini aldýk.
	     System.out.print("Final Sýnav Sonucunuz Nedir? ");
	     int finalGet = share.nextInt();//Final deðerini aldýk.
        int valueNote = ((midtermGet*50)/100) + ((finalGet*70)/100);//Puan Hesaplamasýný yaptýk.
        if(valueNote>=70&&valueNote<=100)//Ýf bloklarýnda sonucu karþýlaþtýrýp karþýlýk geren harf notunu ekrana bastýrdýk.
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
		 Grading(); //Grading fonksiyonunu çaðýrdýk.
	}

}
