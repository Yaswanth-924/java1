package mypackday3;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the temperature");
     int temp=sc.nextInt();
     if(temp>40) {
    	 System.out.println("temp is hot --wear cotton clothes");
    	 
     }
      if(temp<41 && temp>30) {
    	  System.out.println("weather is normal today");
      }
      if(temp<31 && temp>20) {
    	  System.out.println("weather is cool--wear sweaters");
      }
      if(temp<21) {
    	  System.out.println("itss coooooolllllllllllllllllllllllll");
      }
	}

}
