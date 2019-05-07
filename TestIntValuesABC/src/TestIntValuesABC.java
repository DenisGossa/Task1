/**
 * TestIntValuesABC 
 *
 * Version 1.0
 *
 * Date 04.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
//package by.doitnow.denisgossa.task1;
import java.util.Scanner;
public  class TestIntValuesABC {
private int a;
private int b;
private int c;

public void seta() {
		a=getInt();
	}

public void setb() {
		b=getInt();
	}

public void setc() {
		c=getInt();
}

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

void testIntNum() {
	if(a==b & a==c & c==b) {System.out.println("a=b=c");return;}
	if(a==b) {System.out.println("a=b");}
	else if(a==c) {System.out.println("a=c");}
	else if(b==c) {System.out.println("b=c");}
	else {System.out.println("a,b,c not equal");}
	
	
}

	
	
	public static void main(String[] args) {
		
		TestIntValuesABC TestIntabc=new TestIntValuesABC();
		
		
		TestIntabc.seta();		
		TestIntabc.setb();
		TestIntabc.setc();
		
		System.out.println("a:"+TestIntabc.a+" b:"+TestIntabc.b+" c:"+TestIntabc.c);
		
		TestIntabc.testIntNum();
	}

}
