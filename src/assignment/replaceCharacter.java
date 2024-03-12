package assignment;

import java.util.Scanner;

public final class replaceCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=s.nextLine();
		
		System.out.println("enter index to replace the character: ");
		int index=s.nextInt();
		
		System.out.println("enter the character to replace : ");
		char ch=s.next().charAt(0);
		
		StringBuilder string= new StringBuilder(str);
		string.setCharAt(index, ch);
		
		System.out.println("the string after replacing the given character at given index is >>>> " +string);
		// TODO Auto-generated method stub

	}

}
