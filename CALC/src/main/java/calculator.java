
public class calculator {
	static int number1;
	static int number2;
	
	public void setOperands(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;	
	}
	
public static void add()
{  	
	System.out.println("the addition of two numbers is:"+ (number1+number2));
}
public static void sub()
{  	
	System.out.println("the subtraction of two numbers is:"+ number1+number2);
}
public static void  mul()
{  	
	System.out.println("the multiplication of two numbers is:"+ number1*number2); 
}
public void div()
{
	try {
		System.out.println("The Division operation between the two numbers "+number1+" and "+number2+" is: "+(number1 / (double)number2));
	}
	catch(Exception e)
	{
		System.out.println("Second Number cannot be 0");
	}
}

}
