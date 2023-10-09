import java.util.* ;
class Twisted_Prime 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;
		
		twistedPrime(num) ;
	}
	public static void twistedPrime(int num){
		boolean first = checkPrime(num) ;
		int rev = reverse(num) ;
		boolean last = checkPrime(num) ;
		if(first && last){
			System.out.println("Twisted Prime") ;
		}
		else{
			System.out.println("Not a Twisted Prime") ;
		}
	}
	public static boolean checkPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i == 0){
				return false ;
			}
		}
		return true ;
	}
	public static int reverse(int num){
		int rev=0 ;
		for(int i=num; i>0; i/=10){
			int rem=i%10 ;
			rev=rev*10+rem ;
		}
		System.out.println("rev("+num+") = "+rev) ;
		return rev ;
	}
}
