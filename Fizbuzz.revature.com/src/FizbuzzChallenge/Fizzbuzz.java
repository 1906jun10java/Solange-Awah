package FizbuzzChallenge;

public class FizzBuzz {
	
	
	//method
	public void fizzBuzzBasic() {
		
		for( int i= 1; i<=100; i++) {
			
			if ((i%3==0)&&(i%5==0)) {
				System.out.println("Fizzbuzz");
			} else if (i%3==0) {
				System.out.println("Fizz");
			}else if (i%5==0) {
			     System.out.println("Buzz");
		     }else {
				
				System.out.println(i);
		     }
		}		
	}
	
	//create a method
	public void fizzBuzzAdvanced(int m, int n, int[] numbers, String[] terms){
		 
		
		 
	 }
	 
	 
	
	
	
	
}
