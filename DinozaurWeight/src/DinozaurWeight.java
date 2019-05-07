/**
 * DinozaurWeight
 *
 * Version 1.0
 *
 * Date 07.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;

public class DinozaurWeight {
	int weight;
	private static final int MAXWEIGHT=123000;
	
	void setweight() {
		weight=getInt();
		}
	
	double getWeightInTons() {
		return (double)weight/1000;
		}
	
	double getWeightInMlGramms() {
		 return (double)weight*1000000;
		
	}
	
	double getWeightInGrams() {
		return (double)weight*1000;
		}
	
				
	
	
	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
		    System.out.print("Enter a Weight of a Dino (positive number) in kilogramms:");
		    while (!sc.hasNextInt()) {
		        System.out.print("That's not a number!Try again:");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		} while (number>MAXWEIGHT || number <= 0);
		System.out.println("Thank you! Got " + number);
		return number;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DinozaurWeight dw=new DinozaurWeight();
		dw.setweight();
		
		System.out.println("Weight in tons: "+dw.getWeightInTons());
		System.out.println("Weight in miligrams: "+ dw.getWeightInMlGramms());
		System.out.println("Weight in Grams: " +dw.getWeightInGrams());
	}

}
