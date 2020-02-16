package NumberSystem;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
System.out.println("this is done by seenu");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The binary digits");
		int n=sc.nextInt();
		int st=binToDec(n);
		System.out.println(st);	
	}
	private static int binToDec(int n) {
		int dec=0,p=0;
		while(n>0)
		{
			int t=n%10;
			dec=dec+t*pow(2,p);
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
