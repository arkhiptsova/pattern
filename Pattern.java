package FeetNumber;

/*
Mila 
Java application using nested loops that will print two of the following patterns.
Pattern.java
*/

public class Pattern {

	public static void main(String[] args) {		
		int i;
		int j=0;	
		for ( i=1; i <= 6; i++) {		
			for ( j=1; j<=i ; j++) {
			System.out.print(j + " ");			
		}
		System.out.println(" ");
	}
		System.out.println(" ");
		for ( i=1; i<=6; i++){
			for (j=6; j >= i; j--){ 
			System.out.print(j +" ");
    }
    System.out.println("");
 
}
}
}




