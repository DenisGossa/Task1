/**
 * ReverseOfDigitOfNumber- reverse of 7digits number
 *
 * Version 1.0
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfDigitOfNumber {
	private int num; /*Number for processing*/
	private int countOfDigitsInNum; /* Variable for count of digits our number*/
	private ArrayList<Integer> array = new ArrayList<Integer>();


	/*Function of set of num*/
	private void setNum() {
		num=getInt();
		};
	
	/*Function of finding Arithmetick Average of number*/
	public void	myReverseOfDigits(ArrayList<Integer> list) {
		Collections.reverse(list);
		
		
	}
	
	
	
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

	/*Number of digits in number*/
	int digitsInNum(int n) {
		
		   if ( n < 0 ) return digitsInNum(-n);
		   if ( n < 10 ) return 1;
		   return (1 + digitsInNum( n / 10 ));
		}
		
	/*Function of convertation of digits of our number to  ArrayList*/
	void intToArr(int tmp){
			do{
		    array.add(0,tmp % 10);
		    tmp /= 10;
		} while  (tmp > 0);
	}

	/*Function of convertation from reversing ArrayList to number*/
	public int arrayListToIntNum(ArrayList<Integer> array){
		int tmp=0;
		double power=Math.pow(10, (double)(countOfDigitsInNum-1));
		for(int i=0;i<=countOfDigitsInNum-1;i++){
			tmp+=array.get(i)*power;
			power/=10;
		}
		return tmp;
}
	boolean isZeroAtFirstOfArrayList(ArrayList<Integer> array) {
		return array.get(0)==0;
		
	}
	
	
		public static void main(String[] args) {
			/*creating new object of class*/
			ReverseOfDigitOfNumber tempObj=new ReverseOfDigitOfNumber();
			/*Setting of num*/
			tempObj.setNum();
			/*counting of digits in number*/
			tempObj.countOfDigitsInNum=tempObj.digitsInNum(tempObj.num);
			
			/*cheking number of digit on equals with 7*/
			if(tempObj.countOfDigitsInNum!=7) {
				System.out.println("a num of Digits num must be 7");return;
			}
			
			/*Out the msg about current digits*/
			System.out.println("Digits in num: "+tempObj.countOfDigitsInNum);
			
			/*Convert number to  ArrayList*/
			tempObj.intToArr(tempObj.num);
			
			/*Output number as elements of an ArrayList*/
			for(int i=0;i<tempObj.array.size();i++)
				{System.out.print(tempObj.array.get(i)+" ");}
			
					
			tempObj.myReverseOfDigits(tempObj.array);
			/*Output number as elements of an ArrayList*/
			System.out.println();
			for(int i=0;i<tempObj.array.size();i++)
				{System.out.print(tempObj.array.get(i)+" ");}
		
		/*If after reverse the First element is 0 - will be not correct convertation to int*/
		if(!tempObj.isZeroAtFirstOfArrayList(tempObj.array))
		{	
		
		/*Convert reversing  ArrayList to a number and out*/
		int result=tempObj.arrayListToIntNum(tempObj.array);
			System.out.print("\nInt number "+result);
		}
		else {System.out.print("\nZero at last element cant be at first in int type");}
		
	}
		
}
