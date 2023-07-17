import java.util.Scanner;
class Calculator{
	void calc(double num1,double num2,char op) {
		double result;
		switch(op) {
		case '+':
			result=num1 + num2;
			System.out.println("Result "+result);
			break;
			
		case '-':
			result=num1 - num2;
			System.out.println("Result "+result);
			break;
			
		case '*':
			result=num1 * num2;
			System.out.println("Result "+result);
			break;
		case '/':
			if(num2!=0) {
				result=num1 / num2;
				System.out.println("Result "+result);
			}else {
				System.out.println("Divisible by zero is not allowd");
			}
			break;
			
		default:
			System.out.println("Invalid operator");
		}
		
	}
	
	
	
}

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number:");
		double num1=sc.nextInt();
		System.out.println("Enter a second number:");
		double num2=sc.nextInt();
		System.out.println("Enter the operator (+, -, *, /): ");
		char op=sc.next().charAt(0);
		c.calc(num1, num2, op);
		
		

	}

}