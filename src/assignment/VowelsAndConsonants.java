import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.toLowerCase();
		
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println("number of vowels in given string are : "vowelCount);
		System.out.println("number of consonants in given string are : "consonantCount);
		s.close();
		// TODO Auto-generated method stub

	}

}
