package mypackday3;
import java.util.*;
public class AtmExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=10000.0;
		int pin=1234;
		int enteredpin;
		System.out.println("enter your pin:");
		enteredpin=sc.nextInt();
		if(pin!=enteredpin) {
			System.out.println("InCorrectPin");
		}
		int choice;
		do {
			System.out.println("1.ATM MENU");
			System.out.println("2.Check Balanace");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			System.out.println("Enter your CHOICE");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("your balance is:"+balance);
			
			case 2:
				System.out.println("entre the amount to be deposited:");
				double deposit=sc.nextDouble();
				if(deposit%100!=0) {
					System.out.println("pls deposit multiples of 100 ");
				}
				else if(deposit<500) {
					System.out.println("deposit amount must be alteast 500 rupees:");
				}
				else {
                  balance+=deposit;
                  System.out.println("deposited $"+deposit+"new balance is$"+ balance);
				}
			}
		} while(choice!=5);
	}

}
