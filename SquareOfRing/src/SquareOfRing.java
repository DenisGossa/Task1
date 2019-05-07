/**
 * SquareOfRing-Programm find a square of ring between a circle with a radius R1 and a circle with radius r2(r1>r2).The center of circles
 * is the same.
 *
 * Version 1.0
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;

public class SquareOfRing {
	private  float r1;
	private float r2;
	
	private final static double PI=3.141592;
	
	private void setr1r2(){
		
		do {System.out.print("Enter a value of internal radius(r2).Positive number: ");
		r2=getFloat();
		}while(r2<=0);
		
				
		do {System.out.print("Enter a value of external radius(r1) r1>r2: ");
			r1=getFloat();
		}while(r1<=r2);
	}

	private double getSquareOfRing(){
		return (double)(PI*r1*r1-PI*r2*r2);
	}
	
	
	public static float getFloat() {
		Scanner sc = new Scanner(System.in);
		float number;

		    
		    while (!sc.hasNextFloat()) {
		        System.out.print("That's not a number!Try again:");
		        sc.next(); // this is important!
		    }
		    number = sc.nextFloat();
		
	//	System.out.println("Was entering>> " + number);
		return number;
	}
		
	public static void main(String[] args) {
		
		SquareOfRing sor=new SquareOfRing();
		sor.setr1r2();
		System.out.println("SquareOfRing is: " + 	sor.getSquareOfRing());
		
	}

}
