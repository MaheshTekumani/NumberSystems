package NumberSystem;

import java.util.Scanner;

public class DecimalToBinaryConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("EnTer The number");
		int n=sc.nextInt();
		String st=(isBinary(n));
			System.out.println(st);
	}

	private static String isBinary(int n) {
		String bin="";
		System.out.println(bin);
		do
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
			System.out.println(bin);
		}while(n>0);
				
		return bin;
	}

}
