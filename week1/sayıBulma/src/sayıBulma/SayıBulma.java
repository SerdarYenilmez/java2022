package sayıBulma;

public class SayıBulma {

	public static void main(String[] args) {
		int[] sayılar = new int[]{3,7,15,22,29,36,64};
		int aranacak=5;

		boolean varMı=false;

		for(int i=0;i<sayılar.length;i++) {
			if(aranacak==sayılar[i]) {
				varMı=true;
			}
		}
				if(varMı) {   		
					System.out.println("Sayı vardır");
				}else {
					System.out.println("Sayı yoktur");
				}
			}
		}

