package mypackday3;

import java.util.*;
class ScannerExample{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner b=new Scanner(System.in);
		System.out.println("enter a character from B to Z:");
		char ch=b.next().charAt(0);
		ch++;
	System.out.println(ch);	
	}
}