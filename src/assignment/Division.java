package assignment;

public class Division {

	public static void main(String[] args) {
		int num=18;
		int den=0;
		try {
			divideNumbers(num,den);
		}
		catch(ArithmeticException e) {
			System.err.println("error: division by zero");
		}
		// TODO Auto-generated method stub

	}
	public static void divideNumbers(int num,int den) {
		if(den==0) {
			throw new ArithmeticException("division by zero");
			
		}
		int result=num/den;
		System.out.println(result);
	}

}
