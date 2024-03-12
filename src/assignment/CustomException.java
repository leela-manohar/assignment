package assignment;
class CustomValidationException extends Exception{
	public CustomValidationException(String message) {
		super(message);
	}
}

public class CustomException {

	public static void main(String[] args) {
		int num=-1;
		try {
			validateNumber(num);
			
		}
		catch(CustomValidationException e) {
			System.out.println("error: "+ e.getMessage());
		}
		// TODO Auto-generated method stub

	}
	public static void validateNumber(int num) throws CustomValidationException{
		if(num<0) {
			throw new CustomValidationException("number cannot be negative");
		}
		System.out.println("number is valid : " +num);
	}
	

}
