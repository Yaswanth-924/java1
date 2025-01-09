package mypackday3;
import java.util.*;
import java.util.Scanner;

public class AtmWithdrawl {
	public static void main(String[] args) {
		double accountBalance=10000.00;
	     Scanner sc=new Scanner(System.in);
	     System.out.println(" enter the withdrawl money:");
	     double Ent_money=sc.nextDouble();
	     if(Ent_money<accountBalance) {
	    	 System.out.println("withdraw money is:"+ " "+Ent_money);
	    	 Double balance=accountBalance-Ent_money;
	    	 System.out.println("the balance amount is"+balance);
	     }
	     if(Ent_money>accountBalance) {
	    	 System.out.println("insufficient funds");
	     }
	     
}
}
