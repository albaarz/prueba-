/**
 * 
 * @author Angel
 * 
 */

import java.util.Scanner;

public class igual_absoluto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean equal = false;
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		//Mi codigo
		equal= true|false; 		
		equal = num1==num2|num1==num2*-1;
		equal = num1!=num2;
		
		
			
	}
	System.out.println("Result is:" + equal);
}