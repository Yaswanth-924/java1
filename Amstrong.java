package mypackday3;
import java.util.Scanner;
public class Amstrong {

	
	    public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number:");
	    int num=sc.nextInt();
	    int temp=num;
	    int rev=0;
	    while(num>0)
	    {
	    int r=num%10;    
	    rev=rev+r*r*r;  
	    num=num/10;
	    }
	    if(temp==rev){
	        System.out.println("amstrong");
	        
	    }
	    else{
	        System.out.println("not a amstrong");
	    }

	  }
	
}
