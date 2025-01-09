package mypackday3;

import java.util.Scanner;
class ReverseNUmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int rev=0;
		
		while(num>0) 
		{
			int r=num%10;
		    rev=rev*10+r;
			num=num/10;
		}
		int ys=Math.abs(rev);
System.out.println("reverse of a number is :"+ ys);
	}

}

