//tamrin1-fasl4
import java.util.Scanner;
import java.util.Arrays;

public class List {

	public static void main( String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] strArray = new String [4];
		System.out.println("Type 4 words: ");
		for (int i=0 ; i<=3; i++) {
			strArray[i] = scanner.nextLine();
			}
		
		Arrays.sort(strArray);
		System.out.println("words : ");
	    for (int j=0; j<strArray.length ; j++) {
	      System.out.print(strArray[j] + " , ");
	      }
	    }
	}
