package FizbuzzChallenge;

public class FizzbuzzMain {
	public static void main(String[]args) {
	 
	
int min= 1;
int max = 100;
int x = 5;
int y = 3;



for(int i = min; i <= max; i++) {
	  if (1%(x*y)==0) {
		  
		  System.out.println("FizzBuzz");
	  }
	  
	  else if(x%y==0) {
		  
		  System.out.println ("Buzz");
	  }  
			  
		   else if (i%y==0) {
			  System.out.println("Fizz");
			  
		  }else {
			  System.out.println(i);
		  
		  }
		  
	  
}

}

}
		
		
		
		
	
		
	
		



		
	
	
	