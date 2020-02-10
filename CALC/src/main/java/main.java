import java.util.*;
public class main {
public static void main(String args[])
{
	calculator c=new calculator();
	Scanner sc =new Scanner(System.in);
    int n1,n2;
    System.out.println("Enter two numbers ");
    n1=sc.nextInt();
    n2=sc.nextInt();
    System.out.println("Enter operand: 1)addition 2)subtraction 3) multipliation 4) division");
    int  s;
    s=sc.nextInt();
    c.setOperands(n1, n2);
	switch(s)       //KISS PRINCIPLE
	{
	case 1:
		c.add();
		break;

	case 2:
		c.sub();
		break;

	case 3:
		c.mul();
		break;

	case 4:
		c.div();
		break;
	default:
		System.out.println("Choose from only + - * /");
	}
}
}
