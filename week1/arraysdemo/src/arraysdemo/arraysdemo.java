package arraysdemo;

public class arraysdemo {

	public static void main(String[] args) {
     String[] öğrenciler = new String [4];
     öğrenciler[0] = "Serdar";
     öğrenciler[1] = "Evrim";
     öğrenciler[2] = "Pınar";
     öğrenciler[3] = "Eray";
     
for(int i=0;i<öğrenciler.length;i++){	
	System.out.println(öğrenciler[i]);
	
	}

for(String öğrenci:öğrenciler) {
	
	System.out.println(öğrenci);
   }
}
}