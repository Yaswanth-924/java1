package mypackday3;

public class SumOfDigits {

	public static void main(String[] args) {
		 int num=12345;
		    int sum=0;
		    while(num>0)
		    {
		    int r=num%10;
		    sum=sum+r;
		    num=num/10;
		    }
		    
		 System.out.println(sum);
		    }
      }
