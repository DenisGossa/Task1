/**
 * AverageGeomAndArithm
 *  Program have to find Average mathematic and average Geometric of 6-digits number
 *
 * Version 1.0
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;
import java.util.ArrayList;
public class AverageGeomAndArithm {
	private int num; /*Number for checking*/
	private int countOfDigitsInNum; /* Variable for count of digits our number*/
	private ArrayList<Integer> array = new ArrayList<Integer>();


	/*Function of set of num*/
	private void setNum() {
		num=getInt();
		};
	
	/*Function of finding Arithmetick Average of number*/
	public double AverageArithm(ArrayList<Integer> array) {
		int tmp=0;
		for(int i=0;i<array.size();i++)
		tmp+=array.get(i);
		/*(sum of elements)/(count of elements)*/
		return (double)tmp/array.size();
	}
	
	/*Function of finding Geometrick Average of number*/
	public double AverageGeometric(ArrayList<Integer> array) {
		int tmp=1;
		for(int i=0;i<array.size();i++)
		tmp*=array.get(i);
		/*extract the root of n-pow of a product of numbers*/
		return (double)Math.pow(tmp, (double)1/countOfDigitsInNum);
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

	/*Checking  the Arraylist content to growing */
	



		
		public static void main(String[] args) {
			/*creating new object of class*/
			AverageGeomAndArithm tempObj=new AverageGeomAndArithm();
			/*ââîä ÷èñëà*/
			tempObj.setNum();
			/*counting of digits in number*/
			tempObj.countOfDigitsInNum=tempObj.digitsInNum(tempObj.num);
			
			/*cheking number of digit on euals with 6*/
			if(tempObj.countOfDigitsInNum!=6) {
				System.out.println("a num of Digits num must be 6");return;
			}
			
			/*Out the msg about current digits*/
			System.out.println("Digits in num: "+tempObj.countOfDigitsInNum);
			
			/*Convert number to  ArrayList*/
			tempObj.intToArr(tempObj.num);
			
			/*Output number as elements of an ArrayList*/
			for(int i=0;i<tempObj.array.size();i++)
				{System.out.print(tempObj.array.get(i)+" ");}
			
			/*Finding average arithmetic*/
			System.out.println("average arithmetic: "+tempObj.AverageArithm(tempObj.array));
		
			/*Finding average geometric*/
			System.out.println("average geometric: "+tempObj.AverageGeometric(tempObj.array));
		
		}
		
	}
