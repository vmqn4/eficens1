package eficens;

public class Employee {

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 500;
		int c = 300;
		
		if(a>b){
			if(a>c){
				System.out.println("a is big number i.e.." + a);
			}
		}
		else if(b>c){
			System.out.println("b is big number i.e.." + b);
			}
		else{
			System.out.println("c is big number i.e.."+ c);
		}
	}
}
