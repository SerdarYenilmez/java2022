package mükemmelSayı;

public class MükemmelSayı {

	public static void main(String[] args) {
		int number =6;
		int total = 0;
		if (number <= 0) {
			System.out.println("Geçersiz sayı");
			return;
		}

		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("Mükkemmel sayı");
		} else {
			System.out.println("Mükkemmel sayı değildir");
		}

	}
}