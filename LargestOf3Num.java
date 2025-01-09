package mypackday3;
import java.util.Scanner;
public class LargestOf3Num {
	 public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter 1st number:");
	    int a=sc.nextInt();
	    
	    System.out.println("enter 2nd number:");
	    int b=sc.nextInt();
	    
	    System.out.println("enter 3rd number:");
	    int c=sc.nextInt();
	    if (a>b && a>c)
	    {
	        System.out.println("a is larger than B and C :"+" "+a);
	    }
	    else if(b>a && b>c)
	    {
	        System.out.println("b is larger than A and C :"+" "+b);
	    }
	    else 
	    {
	        System.out.println("c is larger than A and B :"+" "+c);
	    }
	}
	}

