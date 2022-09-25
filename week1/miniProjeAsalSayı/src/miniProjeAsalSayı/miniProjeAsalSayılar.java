package miniProjeAsalSayı;

public class miniProjeAsalSayılar {

	public static void main(String[] args) {
		int number = 33;
		int remainder = number % 2;


		if(number<=1) {
			System.out.println("Geçersiz");
			return;
		}
		boolean isPrime = true;
		for(int i=2;i<number;i++) {

			if(number%i==0) {
				isPrime = false;
			}
		}

		if(isPrime) {
			System.out.println("Sayı Asaldır");


		}else {
			System.out.println("Sayı Asal değildir");
			
    		   
       }
    		   
       
       
 
       
	}

}
