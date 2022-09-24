
public class recap_demo_1 {

	public static void main(String[] args) {
     int sayı1 = 10;
     int sayı2 = 12;
     int sayı3 = 49;
     int enBüyükSayı = sayı2;
     
     if (enBüyükSayı>sayı1) {
    	 enBüyükSayı= sayı2;
     }
     if (enBüyükSayı<sayı3) {
    	 enBüyükSayı=sayı3;
     }
     System.out.println("en büyük sayı: " +enBüyükSayı);
	}

}
