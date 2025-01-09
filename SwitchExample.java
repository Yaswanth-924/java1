package mypackday3;
import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the day number:");
	    int dayName=sc.nextInt();
	    switch(dayName) {
	    case 1:
	    	System.out.println("sunday");
	    	break;
	    
	    case 2:
	    	System.out.println("monday");
	    	break;
	    	
	    case 3:
	    	System.out.println("tuesday");
	    	break;
	    	
	    case 4:
	    	System.out.println("wednesday");
	    	break;
	    	
	    case 5:
	    	System.out.println("friday");
	    	break;
	    	
	    case 6:
	    	System.out.println("thursday");
	    	break;
	    	
	    case 7:
	    	System.out.println("satday");
	    	break;
	    	default:
	    		System.out.println("pls enter the dayname between 1 to 7");
	    }

	}

}
