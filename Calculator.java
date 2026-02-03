import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 1st num");
		double num1=scanner.nextDouble();
		System.out.println("enter 2nd num");
		double num2=scanner.nextDouble();
		
		System.out.println("choose the operation ");
		
		System.out.println("+ addition");
		System.out.println("- subtraction");
		System.out.println("* multiplication");
		System.out.println("/ division");
		System.out.println("% remainder");
		
		System.out.println("enter operator ");
		char op=scanner.next().trim().charAt(0);
		
		double result;
		
		switch(op){
		
		case '+' :
			result =num1+num2;
			break;
			
		case '-' :
			result =num1-num2;
			break;
			
		case '*' :
			result =num1*num2;
			break;
			
		case '/' :
			if(num2==0){
				System.out.println("enter valid num2 value");
				}
				result=num1/num2;
				
				break;
				
			
		case '%' :
		   if(num2==0){
				System.out.println("enter valid num2 value");
				}
				result=num1%num2;
				
				break;
				
		default :
		
		System.out.println("Invalid operator");
		    return;
			
		}
		
		System.out.println("result is "+result);
		
	}
	
	}
		
		
		