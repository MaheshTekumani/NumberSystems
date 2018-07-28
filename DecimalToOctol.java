package NumberSystem;

import java.util.Scanner;

public class DecimalToOctol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The number");
		int n=sc.nextInt();
		String st=isOctol(n);
		System.out.println(st);
		System.out.printf("%o",n);
		
	}

	private static String isOctol(int n) {
		String s="";
		do
		{
			int t=n%8;
			s=t+s;
			n=n/8;
		}while(n>0);
		return s;
	}

}
