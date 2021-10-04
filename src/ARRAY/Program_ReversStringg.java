
package ARRAY;

import java.util.Scanner;

public class Program_ReversStringg {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String rev = "";
                    int length = text.length();
			for(char i : arr)
				rev = i + rev;
				System.out.println(rev);
	}    
    }
