/**
 * GrowOrDownSequenceOfIntNum-Programm is cheking for growing or reduction(downing) for every all chain-digits in a  4digits number 
 * (1347 - growing, 8642-downing)  
 *
 * Version 1.0
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;
import java.util.ArrayList;

public class GrowOrDownSequenceOfIntNum {
private int num;
private int countOfDigitsInNum; /* the count of digits in getting num
private ArrayList<Integer> array = new ArrayList<Integer>();


/*Setting number function*/
private void setNum() {
	num=getInt();
	};

	
/*Entering integer number function*/
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

/*Fuction of finding count of digit in number*/
int digitsInNum(int n) {
	
	   if ( n < 0 ) return digitsInNum(-n);
	   if ( n < 10 ) return 1;
	   return (1 + digitsInNum( n / 10 ));
	}
	
/*Funtion of convertation of number to ArrayList*/
void intToArr(int tmp){
		do{
	    array.add(0,tmp % 10);
	    tmp /= 10;
	} while  (tmp > 0);
	
	
}

/*fuction of Cheking all digits for growing*/
public boolean  checkListOnGrow(ArrayList<Integer> array) {
	int current=array.get(0);
	for(int i=1;i<array.size();i++)
	{ int next=array.get(i);
		
		if(next>current) {current=next;continue;}
		return false;
		}
	return true;
}

/*fuction of Cheking all digits for downing*/
public boolean  checkListOnDown(ArrayList<Integer> array) {
	int current=array.get(0);
	for(int i=1;i<array.size();i++)
	{ int next=array.get(i);
		
		if(next<current) {current=next;continue;}
		return false;
		
		
	}
	return true;
}



	
	public static void main(String[] args) {
		/*Creating new object*/
		GrowOrDownSequenceOfIntNum tempObj=new GrowOrDownSequenceOfIntNum();
		/*Setting number*/
		tempObj.setNum();
		/*Finding count of digits in num*/
		tempObj.countOfDigitsInNum=tempObj.digitsInNum(tempObj.num);
		
		/*Checking count of digit on 4 sign*/
		if(tempObj.countOfDigitsInNum!=4) {
			System.out.println("a num of Digits num must be 4");return;
		}
		
		/*MSG output*/
		System.out.println("Digits in num: "+tempObj.countOfDigitsInNum);
		
		/*Convert num into an ArrayList*/
		tempObj.intToArr(tempObj.num);
		
		/*control output ArrayList*/
		for(int i=0;i<tempObj.array.size();i++)
			{System.out.print(tempObj.array.get(i)+" ");}
		
	/*Checking content for growing ,downing*/	
	boolean isGrow=tempObj.checkListOnGrow(tempObj.array);
	boolean isDown=tempObj.checkListOnDown(tempObj.array);
	if(isGrow) {System.out.println("ARRAY IS GROW");}
	if(isDown) {System.out.println("ARRAY IS Down");}
	if(!isGrow&&!isDown){System.out.println("ARRAY It's not grow and not down");};
	
	}
	
}
