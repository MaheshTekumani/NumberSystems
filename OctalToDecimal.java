package NumberSystem;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int st=octalToDec(n);
		System.out.println(st);
	}

	private static int octalToDec(int n) {
		int dec=0,p=0;
		while(n>0)
		{
			int t=n%10;
			dec=dec+t*pow(8,p);
			p++;
			n=n/10;
		}
		return dec;
	}

	private static int pow(int i, int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*i;
			p--;
		}
		return pw;
	}

}
