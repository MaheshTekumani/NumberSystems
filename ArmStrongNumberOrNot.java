package NumberSystem;

import java.util.Scanner;

public class ArmStrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		boolean st=isArmStrong(n);
		if(st)
			System.out.println(n+" is ArmStrong Number");
		else
			System.out.println(n+" is Not ArmStrong Number");
	}

	private static boolean isArmStrong(int n) {
		int c=countDigits(n);
		int k=n;
		int sum=0;
		while(n>0)
		{
			int t=n%10;
			sum=sum+power(t,c);
			 n=n/10;
		}
		return sum==k;
	}

	
	private static int countDigits(int n) {
		int count=0;
		do{
			count++;
			n=n/10;
		}
		while(n>0);
		return count;
	}
	
	
	private static int power(int t, int c) {
		int pw=1;
		while(c>0)
		{
			pw=pw*t;
			c--;
			
		}
		return pw;
	}


}
