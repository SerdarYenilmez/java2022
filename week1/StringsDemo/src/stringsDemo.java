
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj= "I dream of gardens in the desert sand";
		System.out.println(mesaj);

//		System.out.println("Mesaj Uzunluğu :" + mesaj.length());
//		System.out.println("7. Karakter : " +mesaj.charAt(6));
//		System.out.println(mesaj.concat("I wake in vain"));
//		System.out.println(mesaj.startsWith("I"));
//		System.out.println(mesaj.endsWith("d"));
//		char[]karakterler = new char[7];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("gar"));

		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(4,7));


	}    		
}


