package workaganum;

public class helo
{
	public static void main(String a[]) {
	
		int n=2486842;
		int r,sum=0,temp;
		int val=0;
		temp=n;
		while(n>0)
		{
			r=n%10; //remainder
			
			if(r%2==0)
			{
				val = val + r;
			}
		    sum=(sum*10)+r;
		    n=n/10;
		
		
		    
	}
	
		
		if(temp==sum) {
			System.out.println("It is palindrome");
			
			
	        if(val>25) {
	        
	     System.out.println("the sum of even digits is:"+val);
	        }
		}
		else {
			System.out.println("It is not a palindrome");
		}

}
}
