package NumberSystem;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		boolean st=isPrime(n);
		if(st)
			System.out.println(n+" is Prime Number");
		else 
			System.out.println(n+" is Not Prime Number");
	}

	private static boolean isPrime(int n) {
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0)
			{
				count++;
			}
		}
		return count<=2;
		
	}

}
