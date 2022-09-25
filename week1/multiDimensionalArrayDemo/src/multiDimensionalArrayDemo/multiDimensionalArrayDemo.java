package multiDimensionalArrayDemo;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
     String[][] şehirler = new String[3][3];
     şehirler [0][0]="İstanbul";
     şehirler [0][1]="Edirne";
     şehirler [0][2]="Çanakkale";
     şehirler [1][0]="İzmir";
     şehirler [1][1]="Uşak";
     şehirler [1][2]="Muğla";
     şehirler [2][0]="Çorum";
     şehirler [2][1]="Trabzon";
     şehirler [2][2]="Samsun";
     
     for(int i=0;i<=2;i++) {
    	 System.out.println("----------------");
    	 for(int j=0;j<=2;j++) {
    		 System.out.println(şehirler [i][j]);
    	 }
    	 
     }
	}

}
