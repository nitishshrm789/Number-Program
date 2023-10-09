import java.util.* ;
class Bouncy_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		if(checkBouncy(num)){
			System.out.println("Bouncy Number") ;
		}
		else{
			System.out.println("It is not a bouncy number") ;
		}
	}
	public static boolean checkBouncy(int num){
		boolean incr=false, decr=false ;
		int last = num%10 ;
		int secLast ;
		while(num > 9){
			num /= 10 ;
			secLast = num%10 ;
			if(last > secLast){
				decr = true ;
			}
			else if(last < secLast){
				incr = true ;
			}

			if(incr && decr){
				 break ;
			}
			else{
				 last = secLast ;	
			}
		}
		if(incr && decr){
			return true ;
		}
		else{
			return false ;
		}
	}
}
