package NumberSystem;

import java.util.Scanner;

public class decimalToHexaDeimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The nuber");
		int n=sc.nextInt();
		String st=toHexaDecimal(n);
		System.out.println(st);
	}

	private static String toHexaDecimal(int n) {
			String s="";
			do
			{
				int t=n%16;
				if(t<10)
				{
				s=t+s;
				}
				else
				{
					s=(char)(t+55)+s;
				}
				n=n/16;
			}while(n>0);
		return s;
	}

}
