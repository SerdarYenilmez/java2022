package arkadaşSayılar;

public class ArkadaşSayılar {

	public static void main(String[] args) {
		int sayı1= 230;
		int sayı2= 284;
		int toplam1=0;
		int toplam2=0;

		for(int i=1;i<sayı1;i++) {
		if(sayı1%i==0) {
			toplam1=toplam1+i;
		}

		}
		for(int i=1;i<sayı2;i++) {
		if(sayı2%i==0) {
			toplam2=toplam2+i;
		}

		}
		if(sayı1==toplam2&&sayı2==toplam2) {
			System.out.println("sayılar arkadaştır");

		}else {
			System.out.println("sayılar arkadaş değildir");
		}
	}
}

