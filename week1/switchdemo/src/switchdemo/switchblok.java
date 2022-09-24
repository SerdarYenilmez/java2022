package switchdemo;

public class switchblok {

	public static void main(String[] args) {
     char grade = 'B';
     
     switch (grade) {
     case 'A':
    	 System.out.println("Excellent");
    	 break;
     case 'B':
    	 System.out.println("Good");
    	 break;
     case 'C':
    	 System.out.println("Satisfactory");
    	 break;
     case 'D':
    	 System.out.println("Pass");
    	 break;
     case 'F':
    	 System.out.println("Fail");
    	 break;
    	 default:
    		 System.out.println("Unvalid Grade");
     }
	}

}
