package mypackday3;
import java.util.*;
public class Fibanocci {
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
    
	public static void main(String[] args) {
	  int terms=10;
	  for(int i=0;i<=terms;i++) {
		  System.out.println(fib(i)+"  ");
	  }
	}
}

	


