package Assignment1;

import java.util.Scanner;

public class StringAssignment2 {

	public static void main(String[] args) {
		
		String s1 ="The quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s2 =sc.next();
		
		if(s1.contains(s2)){
			System.out.println("substring found");
		}else{
			System.out.println("Substring not found");
		}
				
		

		
		
	}

}
