package practicals;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
			//Reverse string by stringBuffer
		Scanner sc = new Scanner(System.in);
			StringBuffer str = new StringBuffer(sc.next());
		
			str = str.reverse();
			System.out.println(str);
		
		
	}

}
