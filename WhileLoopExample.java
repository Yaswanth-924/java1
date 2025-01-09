package mypackday3;
import java.util.*;
public class WhileLoopExample {

	public static void main(String[] args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
		int num=sc.nextInt();
		while(i<=num) {
			System.out.println(i);
			i++;
			i=i+1;
		}
	}

}
