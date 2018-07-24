package NumberSystem;

import java.util.Scanner;

public class PalindromeOrNOt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		if(isPalin(n))
			System.out.println(n+" is Palindrome");
		else 
			System.out.println(n+" is not palindrome");
	
	}

	private static boolean isPalin(int n) {
		int k=n;
		int rev=0;
		while(n>0)
		{
			int t=n%10;
			rev=(rev*10)+t;
			n=n/10;
		}
		if(rev==k)
			return true;
			else
		
		
		return false;
	}

}
