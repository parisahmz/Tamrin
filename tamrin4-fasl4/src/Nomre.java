import java.util.Scanner;

public class Nomre {
	
	private int outstanding = 0 ;
	private int stidfactory = 0 ;
	private int unsatisfactory = 0 ;
	
	public void setNomre() {
		
		Scanner scanner = new Scanner(System.in);
		
		float[] n = new float[20];
		System.out.println("Enter nomre : ");
		for( int i=0 ; i<20 ; i++) {
			n[i] = scanner.nextFloat();
			
			if(n[i] <= 59) {
				unsatisfactory ++ ;
			}
			else if( n[i] >= 60 & n[i] <= 89) {
				stidfactory ++ ;
			}
			else if(n[i] >= 90 & n[i] <= 100) {
				outstanding ++ ;
			} 
			
			else
				System.out.println( "Eror..." );
		    }
		
		System.out.println( unsatisfactory + " number of student rejected.");
		System.out.println( stidfactory + " number of student passed.");
		System.out.println( outstanding + " number of student are top student.");
		
	    }	
	}

