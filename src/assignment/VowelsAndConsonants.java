

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
		System.out.println(vowelCount);
		System.out.println(consonantCount);
		s.close();
		// TODO Auto-generated method stub

	}

}
