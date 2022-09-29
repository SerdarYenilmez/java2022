
public class Main {

	public static void main(String[] args) {
		String mesaj = "kodlama.io ödev 2";
		String yeniMesaj = mesaj.substring(0, 3);
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2,4,6,13,65);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Guncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
	
	
		int toplam = 0;
		for (int sayi : sayilar){
				toplam += sayi;
						
			}
			return toplam;
		}
	}
