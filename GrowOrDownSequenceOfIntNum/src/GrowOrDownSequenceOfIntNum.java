
import java.util.Scanner;
import java.util.ArrayList;

public class GrowOrDownSequenceOfIntNum {
private int num;
private int countOfDigitsInNum; /* переменная для хранения оличества разрядов в числе*/
private ArrayList<Integer> array = new ArrayList<Integer>();


/*функция установки num*/
private void setNum() {
	num=getInt();
	};

	
/*ввод числа int с консоли с проверкой*/
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

/*количество разрядов в полученном числе*/
int digitsInNum(int n) {
	
	   if ( n < 0 ) return digitsInNum(-n);
	   if ( n < 10 ) return 1;
	   return (1 + digitsInNum( n / 10 ));
	}
	
/*для удобства работы преобразовываем введенное число в массив ArrayList*/
void intToArr(int tmp){
		do{
	    array.add(0,tmp % 10);
	    tmp /= 10;
	} while  (tmp > 0);
	
	
}

/*проверка чисел из Arraylist на возрастание*/
public boolean  checkListOnGrow(ArrayList<Integer> array) {
	int current=array.get(0);
	for(int i=1;i<array.size();i++)
	{ int next=array.get(i);
		
		if(next>current) {current=next;continue;}
		return false;
		}
	return true;
}

/*проверка чисел из Arraylist на убывание*/
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
		/*собздание нового объекта*/
		GrowOrDownSequenceOfIntNum tempObj=new GrowOrDownSequenceOfIntNum();
		/*ввод числа*/
		tempObj.setNum();
		/*подсчет числа разрядов в введенном числе*/
		tempObj.countOfDigitsInNum=tempObj.digitsInNum(tempObj.num);
		
		/*по условию задачи разрядов должно быть 4*/
		if(tempObj.countOfDigitsInNum!=4) {
			System.out.println("a num of Digits num must be 4");return;
		}
		
		/*вывод сообщения о колчиестве разрядов*/
		System.out.println("Digits in num: "+tempObj.countOfDigitsInNum);
		
		/*преобразование числа в ArrayList*/
		tempObj.intToArr(tempObj.num);
		
		/*вывод числа как элементов ArrayList*/
		for(int i=0;i<tempObj.array.size();i++)
			{System.out.print(tempObj.array.get(i)+" ");}
		
	/*проверка на рост или убывание элементов*/	
	boolean isGrow=tempObj.checkListOnGrow(tempObj.array);
	boolean isDown=tempObj.checkListOnDown(tempObj.array);
	if(isGrow) {System.out.println("ARRAY IS GROW");}
	if(isDown) {System.out.println("ARRAY IS Down");}
	if(!isGrow&&!isDown){System.out.println("ARRAY It's not grow and not down");};
	
	}
	
}
