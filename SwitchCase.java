package eficens;

public class SwitchCase {

	public static void main(String[] args) {
		double i = 10;
		double j = 3;
		char operation= '/';
		double result;
		
		switch(operation) {
		
		case '+' :
			result = i+j;
			System.out.println("The addition of two numbers is : " + result);
			break;
			
		case '-' :
			result = i-j;
			System.out.println("Subtraction of two numbers is : " + result);
			break;
			
		case '*' :
			result = i*j;
			System.out.println("Multiplication of two numbers is :" + result);
			break;
			
		case '/' :
			result = i/j;
			System.out.println("Division of two numbers is : " + result);
			break;
			
		default :
			System.out.println("The operation is not defined");
			break;
			
			
		
			
		}
	}

}
