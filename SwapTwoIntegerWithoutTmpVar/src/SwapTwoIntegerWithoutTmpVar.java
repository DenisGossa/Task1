/**
 * SwapTwoIntegerWithoutTmpVar
 *
 * Version 1.0
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */

import java.util.Scanner;
public class SwapTwoIntegerWithoutTmpVar {
	private int a,b; /*Number for processing*/
	


	/*Function of set of num*/
	private void setAB() {
		a=getInt();
		b=getInt();
		};
			
	/*Entering of number of int type from console*/
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int number;
		//do {
		    System.out.print("Enter a number:");
		    while (!sc.hasNextInt()) {
		        System.out.print("That's not a number!Try again:");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		//} while (number <= 0);
		System.out.println("Thank you! Got " + number);
		return number;
		
	}	

	private void swapAB() {
				
				a = a^b;
				b = a^b;
				a = a^b;
		};

	
	
		public static void main(String[] args) {
			/*creating new object of class*/
			SwapTwoIntegerWithoutTmpVar tempObj=new SwapTwoIntegerWithoutTmpVar();
			/*Setting of num*/
			tempObj.setAB();
			
			/*Out A B before swapping*/
			System.out.println("Before Swapping");
			System.out.println("A:"+tempObj.a+" B:"+tempObj.b);
			
			/*Fuction of swapping without 3-rd variable*/
			tempObj.swapAB();
			
			/*Out A B after swapping*/
			System.out.println("After Swapping");
			System.out.println("A:"+tempObj.a+" B:"+tempObj.b);
		}
}