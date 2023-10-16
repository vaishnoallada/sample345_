package demo1.bbb;

public class Main implements ArthematicOps{

	@Override
	public void addition(int a, int b) {
		System.out.println("The addition of two numbers is "+ (a+b));
		
	}

	@Override
	public void substraction(int a, int b) {
		System.out.println("The substraction of two numbers is "+ (a-b));
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("The Multiplication of two numbers is "+ (a*b));
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println("The division of two numbers is "+ (a/b));
		
	}

}
